package Inerview50;

import java.util.Scanner;

public class Question5 {

	static int num1=0;
	static int num2=1;
	static int num3=0;
	
	public static void fibonacchi(int count)
	{
		if (count>0) {
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
			fibonacchi(count-1);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count=sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		fibonacchi(count-2);
	}
}
