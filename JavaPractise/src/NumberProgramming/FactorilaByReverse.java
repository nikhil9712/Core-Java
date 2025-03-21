package NumberProgramming;

import java.util.Scanner;

public class FactorilaByReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		System.out.println("The factorial of " + num + " is : " + factorialByReverse(num));
	}

	public static int factorialByReverse(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}
}
