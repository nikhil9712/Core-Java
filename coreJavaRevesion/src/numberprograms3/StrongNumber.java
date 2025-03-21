package numberprograms3;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int temp = number;
		sc.close();

		int sum = 0;

		while (number > 0) {
			int rem = number % 10;
			int factorial = factorial(rem);
			sum += factorial;
			number /= 10;
		}

		if (temp == sum) {
			System.out.println(temp + " is Strong Numner");
		} else {
			System.out.println(temp + " is Not a Strong Numner");
		}

	}

	public static int factorial(int number) {
		int factorial = 0;
		for (int i = 1; i <= number; i++) {
			factorial += i;
		}
		return factorial;
	}
}
