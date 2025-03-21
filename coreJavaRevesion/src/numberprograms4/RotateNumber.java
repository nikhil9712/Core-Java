package numberprograms4;

import java.util.Scanner;

public class RotateNumber {

	// 12345
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;

		System.out.println("Enter The Number of Rotations : ");
		int k = sc.nextInt();
		int k1 = k;

		int count = count(number);

		int rotatednumber = number;

		while (k > 0) {
			int rem = number % 10;
			int power = power(10, count-1);
			number /= 10;
			rotatednumber = rem * power +number;
			number=rotatednumber;
			//count--;
			k--;
		}

		System.out.println(
				"The Rotated Number After Rotating " + temp + " rotating " + k1 + " times is " + rotatednumber);

		sc.close();

	}

	public static int count(int number) {
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static int power(int base, int raise) {
		int power = 1;
		for (int i = 1; i <= raise; i++) {
			power = power * base;
		}
		return power;
	}

}
