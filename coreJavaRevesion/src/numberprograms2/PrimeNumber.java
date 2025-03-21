package numberprograms2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");

		int number = sc.nextInt();
		int count = 0;

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				break;
			}
			count++;
		}

		if ((number / 2) - 2 == count) {
			System.out.println("The Number is Prime Number");
		} else {
			System.out.println("The Number Not a Prime Number");
		}

		sc.close();

	}
}
