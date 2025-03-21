package numberprograms3;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int temp = number;
		sc.close();

		if (number%10 == 7 || number%7==0) {
			System.out.println(temp + " is Buzz Numner");
		} else {
			System.out.println(temp + " is Not a Buzz Numner");
		}

	}
}
