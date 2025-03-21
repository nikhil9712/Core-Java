package NumberProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			System.out.println("The reverse of the number is: "+reverse(num));
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a valid input !!");
		}
	}
	public static int reverse(int num)
	{
		int reverseNumber=0;
		while(num!=0)
		{
			int rem=num%10;
			reverseNumber=(reverseNumber*10)+rem;
			num/=10;
		}
		return reverseNumber;
	}
}
