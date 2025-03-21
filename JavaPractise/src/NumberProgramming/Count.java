package NumberProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number: ");
			int num=sc.nextInt();
			System.out.println("The count of the number is: "+count(num));
			 String s="5";
			 int a=Integer.parseInt(s);
			 System.out.println(a+10);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a valid input !!");
		}
	}
	public static int count(int num)
	{
		int ct=0;
		while(num!=0){
			num/=10;
			ct++;
		}
		return ct;
	}
	
}
