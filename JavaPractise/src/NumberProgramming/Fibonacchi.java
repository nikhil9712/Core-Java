package NumberProgramming;

import java.util.Scanner;

public class Fibonacchi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count: ");
		int count = sc.nextInt();
		fibonacchi(count);
	}

	public static void fibonacchi(int count) {
		int num1 = 0;
		int num2 = 1;
		for (int i = 1; i <= count; i++) {
			int num3 = num1 + num2;
			System.out.print(num1 + " ");
			num1 = num2;
			num2 = num3;
		}
	}
}
