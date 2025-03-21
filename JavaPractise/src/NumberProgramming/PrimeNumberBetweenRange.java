package NumberProgramming;

import java.util.Scanner;

public class PrimeNumberBetweenRange {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter start: ");
			int start=sc.nextInt();
			System.out.println("Enter end: ");
			int end=sc.nextInt();
			for (int i = start; i <end; i++) {
				if (isprime(i)) {
					System.out.print(i+" ");
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
