package numberprograms4;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;
		sc.close();

		int count = count(number);

		int lastDigits = getLastDigits(number, count);

		if (temp == lastDigits) {
			System.out.println(temp + " is a Automorphic Number");
		} else {
			System.out.println(temp + " is a Not Automorphic Number");
		}
	}

	public static int count(int number) {
		int count = 0;

		while (number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}

	public static int getLastDigits(int number, int lastCount) {
		int power = 1;
		number=number * number;
		
		
		for (int i = 0; i < lastCount; i++) {
			power = power * 10;
		}
		return number % power;
	}

}
