package numberprograms1;

import java.util.Scanner;

public class ReversePrintingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();

		while (number > 0) {
			int rem = number % 10;
			System.out.print(rem);
			number = number / 10;
		}
		
		sc.close();
	}
}
