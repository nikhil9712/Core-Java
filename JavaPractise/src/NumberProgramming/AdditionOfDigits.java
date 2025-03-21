package NumberProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionOfDigits {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			System.out.println("The reverse of the number is: "+additionOfDigits(num));
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a valid input !!");
		}
	}
	public static int additionOfDigits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}
}
