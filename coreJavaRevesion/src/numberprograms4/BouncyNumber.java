package numberprograms4;

import java.util.Scanner;

public class BouncyNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;
		sc.close();

		if (isDecreasing(number) || isIncreasing(number) || number<100) {
			System.out.println(number + " is a Not Bouncy Number");
		} else {
			System.out.println(temp + " is a Bouncy Number");
		}

	}

	public static boolean isDecreasing(int number) {
		int lastnumber = number % 10;

		while (number > 0) {
			int rem = number % 10;

			if (lastnumber < rem) {
				return false;
			} else {
				lastnumber = rem;
			}

			number /= 10;

		}
		return true;
	}

	public static boolean isIncreasing(int number) {
		int lastnumber = number % 10;

		while (number > 0) {
			int rem = number % 10;

			if (lastnumber > rem) {
				return false;
			} else {
				lastnumber = rem;
			}

			number /= 10;
		}
		return true;
	}

}
