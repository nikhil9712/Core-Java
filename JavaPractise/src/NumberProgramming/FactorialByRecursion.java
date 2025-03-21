package NumberProgramming;

import java.util.Scanner;

public class FactorialByRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		System.out.println("The factorial of " + num + " is : " + factorial(num));
	}
	public static int factorial(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
