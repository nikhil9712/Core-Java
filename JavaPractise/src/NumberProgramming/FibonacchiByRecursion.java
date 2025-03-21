package NumberProgramming;

import java.util.Scanner;

public class FibonacchiByRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count: ");
		int count=sc.nextInt();
		for (int i = 0; i <count; i++) {
			System.out.print(fibonacchiByrecursion(i)+" ");
		}
	}
	public static int fibonacchiByrecursion(int num)
	{
		if (num==0) {
			return 0;
		}
		else if(num==1)
		{
			return 1;
		}
			return fibonacchiByrecursion(num-1)+fibonacchiByrecursion(num-2);
	}
}
