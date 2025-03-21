package numberprograms3;

import java.util.Scanner;

public class PrimeNumberBetweenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Start Number");
		int start = sc.nextInt();

		System.out.println("Enter The End Number");
		int end = sc.nextInt();

		sc.close();
		System.out.println("The Prime Number between Range " + start + " to " + end + " are : ");

		for (int i = start; i <= end; i++) {
			if (i!=1 && isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number%i == 0) {
				return false;
			}
		}
		return true;
	}
}
