package NumberProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReversePrinting {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			reversePrint(num);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a valid input !!");
		}
	}
	
	public static void reversePrint(int num)
	{
	  while(num!=0)
	  {
		  System.out.print(num%10);
		  num/=10;
	  }
	}
	
}
