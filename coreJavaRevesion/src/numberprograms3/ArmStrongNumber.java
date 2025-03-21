package numberprograms3;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();
		sc.close();
		int temp = number;
		int totalSum = 0;
		int count = count(number);
		System.out.println("The Number Of Digits Are :" + count);

		while (number > 0) {
			int rem = number % 10;
			int power = power(rem, count);
			totalSum += power;
			number = number / 10;
		}
  
		if (temp == totalSum) {
			System.out.println(temp + " Is a ArmStrong Number.");
		} else {
			System.out.println(temp + " Is Not a ArmStrong Number.");
		}

	}

	public static int count(int number) {
		int count = 0;

		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;

	}

	public static int power(int base, int raise) {
		int power = 1;
		for (int i = 1; i <= raise; i++) {
			power *= base;
		}
		return power;
	}
}
