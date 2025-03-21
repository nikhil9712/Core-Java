package NumberProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			if (isUnique(num)) {
				System.out.println(num+" is a Unique Number !!");
			} else {
				System.out.println(num+" is not a Unique Number !!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a valid input !!");
		}
	}

public static boolean isUnique(int num)
{
	boolean ans=false;
	int sum=additionOfDigits(num);
	int prod=1;
	while(num!=0)
	{
		int rem=num%10;
		prod*=rem;
		num/=10;
	}
	if (prod==sum) {
		ans=true;
	}
	return ans;
	
	
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
