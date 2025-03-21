package numberprograms3;

import java.util.Scanner;

public class DisarriumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;
		sc.close();
		int sum = 0;

		int count = count(number);
		
		while (number > 0) {
			int rem = number % 10;
			int power = power(rem, count);
			sum += power;
			count--;
			number /= 10;
		}

		if (temp == sum) {
			System.out.println(temp + " is a Dissarium Number");
		} else {
			System.out.println(temp + " is a Not a Dissarium Number");
		}

	}

	public static int power(int base, int raise) {
		int power = 1;
		for (int i = 1; i <= raise; i++) {
			power = power * base;
		}
		return power;
	}

	public static int count(int number) {
		int count = 0;
		while (number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}

}
