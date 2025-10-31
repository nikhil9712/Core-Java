package numberprogram5;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();

		int digitsCount = 0;
		int countTemp = num;
		while (countTemp > 0) {
			countTemp /= 10;
			digitsCount += 1;
		}

		int totalSum = 0;
		int totalSumtem = num;
		while (totalSumtem > 0) {

			int temp = totalSumtem % 10;
			int power = 1;
			for (int i = 1; i <= digitsCount; i++) {
				power = power * temp;
			}
			totalSum += power;
			totalSumtem /= 10;
		}
		
		if (num==totalSum) {
			System.out.println("The Entered Number is Armstrong Number !!");
		} else {
			System.out.println("The Entered Number is not Armstrong Number !!");
		}
	}
}
