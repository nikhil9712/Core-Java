package numberprograms1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int temp = number;

		int reverse = 0;
		while (number > 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}

		if (temp == reverse) {
			System.out.println(temp + " is a palindromer Number");
		} else {
			System.out.println(temp + " is a Not palindromer Number");
		}

	}
}