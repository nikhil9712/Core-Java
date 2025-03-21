package NumberProgramming;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		System.out.println("Enter raise: ");
		int raise = sc.nextInt();
		System.out.println("The power of "+num+" to the power "+raise+ " is : "+power(num,raise));
		
	}
	public static int power(int num,int raise)
	{
		int pow=1;
		for (int i = 1; i <=raise; i++) {
			pow=pow*num;
		}
		return pow;
	}
}
