package numberprograms1;

import java.util.Scanner;

public class SPYNumber {

	// If Sum and product Of All the Digits Of that Number is same
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int temp = number;
		int sum = 0;
		int product = 1;

		while (number > 0) {
			int rem = number % 10;
			sum += rem;
			product *= rem;
			number = number / 10;

		}

		if (sum == product) {
			System.out.println(temp + " is a SPY Number");
		} else {
			System.out.println(temp + " is a Not SPY Number");
		}
		// System.out.println(reverseNumber);

		sc.close();
	}

}
