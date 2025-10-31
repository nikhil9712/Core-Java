package numberprogram5;

import java.util.Scanner;

public class AdditionofNumberBetweenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter From Number : ");
		int fromNumber = sc.nextInt();
		System.out.println("Enter To Number : ");
		int toNumber = sc.nextInt();

		int sum = 0;
		for (int i = fromNumber; i <= toNumber; i++) {
			sum += i;
		}
		System.out.println("The Sum of All Number between " + fromNumber + " and " + toNumber + " is : " + sum);
		sc.close();
	}

}
