package NumberProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			if (isHarshad(num)) {
				System.out.println(num + " is a Harshad Number !!");
			} else {
				System.out.println(num + " is not a Harshad Number !!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a valid input !!");
		}
	}

	private static boolean isHarshad(int num) {
		int sumOfDigit = additionOfDigits(num);
		if (num % sumOfDigit == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int additionOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}
}
