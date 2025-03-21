package NumberProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter year: ");
			int year = sc.nextInt();
			if (isLeap(year)) {
				System.out.println(year+" is a Leap year !!");
			} else {
				System.out.println(year+" is not a Leap year !!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a valid input !!");
		}
	}
	public static boolean isLeap(int year)
	{    boolean ans=false;
		if((year%4==0 && year%100!=0) || year%400==0) {
			ans=true;
		}
		return ans;
	}
	
}
