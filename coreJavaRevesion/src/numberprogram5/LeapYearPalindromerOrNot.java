package numberprogram5;

import java.util.Scanner;

public class LeapYearPalindromerOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Year");
		int year = sc.nextInt();

		if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && isPalindrome(year)) {
			System.out.println("Year is leap year and palidnrome as well ");
		} else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Year is leap year but not palindrome");
		}else
		{
			System.out.println("Year is Not leap year");
		}

		sc.close();
	}

	public static boolean isPalindrome(int year) {
		int reverse = 0;
		int temp = year;
		while (year > 0) {
			int rem = year % 10;
			reverse = reverse * 10 + rem;
			year /= 10;
		}
		return reverse == temp;
	}
}
