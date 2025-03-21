package numberprograms4;

import java.util.Scanner;

public class TwistedEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;
		sc.close();

		if (isEven(number) && isEven(reverse(number))) {
			System.out.println(temp + " is a Twisted Even Number");
		} else {
			System.out.println(temp + " is a Not a Twisted Even Number");
		}

	}

	public static boolean isEven(int number) {
	    return number % 2 == 0;
	}


	public static int reverse(int number) {
		int reverse = 0;

		while (number > 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number /= 10;
		}

		return reverse;
	}
}
