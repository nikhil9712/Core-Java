package numberprograms3;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		// greatest common divisor (GCD) of coprime numbers is 1.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;

		int sum = 0;
		while (number > 0) {
			int rem = number % 10;
			sum += rem;
			number /= 10;
		}

		if (sum!=0 && temp % sum == 0) {
			System.out.println(temp+" is a Harshad Number");
		} else {
			System.out.println(temp+" is a  Not a Harshad Number");
		}

	}
}
