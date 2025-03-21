package numberprograms2;

import java.util.Scanner;

public class FactorialByReverseOrder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int temp = number;
		int factorial = 1;

		for (int i = number; i > 0; i--) {
			factorial *= i;
		}

		System.out.println("Factorial of " + temp + " is " + factorial);
		sc.close();

	}
}
