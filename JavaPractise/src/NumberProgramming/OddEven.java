package NumberProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number: ");
			int num=sc.nextInt();
			checkOddEven(num);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a valid input !!");
		}
	}
	public static void checkOddEven(int num)
	{
		if ((num/2)*2==num) {
			System.out.println("The Number is Even Number !!");
		} else {
			System.out.println("The Number is Odd Number !!");
		}
	}
	
}
