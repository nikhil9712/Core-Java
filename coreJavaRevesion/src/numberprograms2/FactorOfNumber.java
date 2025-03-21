package numberprograms2;

import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();

		System.out.println("The Factors of The Given Number is : ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
		
		long endTime = System.currentTimeMillis();

		long elapsedTime = endTime - startTime;

		System.out.println("Execution time in milliseconds: " + elapsedTime);
	}

}
