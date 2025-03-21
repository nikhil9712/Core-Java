package numberprograms2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number1");
		int number1 = sc.nextInt();

		System.out.println("Enter The Number2");
		int number2 = sc.nextInt();

		int smallerNumber = number1 < number2 ? number1 : number2;
		int largerNumber = number1 > number2 ? number1 : number2;

		for (int i = smallerNumber; i <= number1*number2; i++) {
			if (i % smallerNumber == 0 && i % largerNumber == 0) {
				System.out.println("The LCM of " + number1 + " and " + number2 + " is " + i);
				break;
			}
		}
		sc.close();
	}

}
