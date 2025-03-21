package numberprograms2;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number1");
		int number1 = sc.nextInt();

		System.out.println("Enter The Number2");
		int number2 = sc.nextInt();

		int smallerNumber = number1 < number2 ? number1 : number2;
		int largerNumber = number1 > number2 ? number1 : number2;

		for (int i = smallerNumber; i > 0; i--) {
			if (smallerNumber % i == 0 && largerNumber % i == 0) {
				System.out.println("The HCF of " + number1 + " and " + number2 + " is " + i);
				break;
			}
		}
		sc.close();
	}
}