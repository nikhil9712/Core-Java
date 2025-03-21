package numberprograms1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("Number is Even Number");
		} else {
			System.out.println("Number is Odd Number");
		}

		if (checkOddEven(number)) {
			System.out.println("Number is Even Number By Another method as Well");
		} else {
			System.out.println("Number is Odd Number By Another Method as Well");
		}

		System.out.println("Enter Starting Point :");
		int start = sc.nextInt();
		System.out.println("Enter Ending Point :");
		int end = sc.nextInt();

		int countEvenBetweenrange = countEvenBetweenrange(start, end);

		System.out.println("Total Number Even Number between Range is :" + countEvenBetweenrange);
		sc.close();
	}

	public static boolean checkOddEven(int number) {
		boolean ans = false;
		if ((number / 2) * 2 == number) {
			ans = true;
		}
		return ans;
	}

	public static int countEvenBetweenrange(int start, int end) {

		int evenCount = 0;
		for (int i = start; i <= end; i++) {

			if (checkOddEven(i)) {
				evenCount++;
			}
		}

		return evenCount;
	}
}
