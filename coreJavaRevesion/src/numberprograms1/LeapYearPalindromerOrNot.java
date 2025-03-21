package numberprograms1;

import java.util.Scanner;

public class LeapYearPalindromerOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Year");
		int year = sc.nextInt();

		if (((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) && (isPalindromer(year))) {
			System.out.println(year + " is a Palindrome Leap year");
		} else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a Leap Year Not Palindrome");
		} else {
			System.out.println(year + " is a Not Leap Year only");
		}
		sc.close();
	}

	public static boolean isPalindromer(int number) {
		int temp = number;
		int reverse = 0;
		while (number > 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}

		if (temp == reverse) {
			return true;
		} else {
			return false;
		}

	}

}
