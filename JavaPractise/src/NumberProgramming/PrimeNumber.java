package NumberProgramming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upper range: ");
		int start = sc.nextInt();
		System.out.println("Enter lower range: ");
		int end = sc.nextInt();
		System.out.println("The prime Numbers between "+start+" and "+end+" are : ");
		for (int i = start; i <= end; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}
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
}
