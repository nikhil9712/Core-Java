package NumberProgramming;

import java.util.Scanner;

public class RotatePrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		if (isprime(num) && isprime(rotate(num))) {
			System.out.println("It is a Rotete Prime number");
		} else {
			System.out.println("It is not a Rotete Prime number");
		}
	}

	public static boolean isprime(int num) {
		boolean ans = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return ans;
	}

	public static int rotate(int num) {
		int reverseNumber = 0;
		while (num != 0) {
			int rem = num % 10;
			reverseNumber = (reverseNumber * 10) + rem;
			num /= 10;
		}
		return reverseNumber;
	}
}
