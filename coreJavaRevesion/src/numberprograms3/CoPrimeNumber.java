package numberprograms3;

import java.util.Scanner;

public class CoPrimeNumber {

	public static void main(String[] args) {

		// greatest common divisor (GCD) of coprime numbers is 1.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number1 : ");
		int number1 = sc.nextInt();

		System.out.println("Enter The Number2: ");
		int number2 = sc.nextInt();
		sc.close();

		int smallNumber = number1 < number2 ? number1 : number2;

		boolean inCoprime = true;

		for (int i = smallNumber; i >= 2; i--) {
			if (number1 % i == 0 && number2 % i == 0) {
				inCoprime = false;
				break;
			}
		}

		if (inCoprime) {
			System.out.println(number1 + " and " + number2 + " are coPrime Number");
		} else {
			System.out.println(number1 + " and " + number2 + " are not coPrime Number");
		}

	}
}
