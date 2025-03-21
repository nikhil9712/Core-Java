package numberprograms3;

import java.util.Scanner;

public class TwistedPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;
		sc.close();

		if (isPrime(number) && isPrime(reverse(number))) {
			System.out.println(temp + " is a Twisted Prime Number");
		} else {
			System.out.println(temp + " is a Not a Twisted Prime Number");
		}

	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int reverse(int number) {
		int reverse=0;
		
		while (number>0) {
			int rem=number%10;
			 reverse=reverse*10+rem;
			number/=10;
		}
		
		return reverse;
	}
}
