package NumberProgramming;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		if (StrongNumber(num)) {
			System.out.println("The Entered Number is StrongNumber !!");
		} else {
			System.out.println("The Entered Number is not a StrongNumber !!");
		}
	}

	public static boolean StrongNumber(int num) {
		int ip = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += factorial(rem);
			num /= 10;
		}
		if (ip == sum) {
			return true;
		} else {
			return false;
		}

	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}
