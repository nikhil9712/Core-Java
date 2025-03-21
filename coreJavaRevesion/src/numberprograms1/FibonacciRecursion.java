package numberprograms1;

import java.util.Scanner;

public class FibonacciRecursion {
	
	//0 1 1 2 3 5 8 13
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position in Fibonacci sequence: ");
		int n = sc.nextInt();
		sc.close();

		// Calculate Fibonacci number at position n
		int result = fibonacci(n);
		System.out.println("Fibonacci number at position " + n + " is " + result);
	}

	// Recursive method to calculate Fibonacci number
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0; // Base case for F(0)
		} else if (n == 1) {
			return 1; // Base case for F(1)
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
		}
	}
}
