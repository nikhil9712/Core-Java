package numberprograms2;

import java.util.Scanner;

public class AdditionOfFirstNaturalNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Natural Number ");
		int naturalNumber = sc.nextInt();

		int totalSum = 0;

		for (int i = 1; i <= naturalNumber; i++) {
			totalSum += i;
		}

		System.out.println("The Sum Of First " + naturalNumber + " is " + totalSum);

		sc.close();
	}
}
