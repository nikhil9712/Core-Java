package Question10;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: " );
		int num=sc.nextInt();
		
		if (checkPrime(num)) {
		System.out.println("Entered Number is Prime Number !!");	
		} else {
			System.out.println("Entered Number is Not Prime Number !!");
		}
	}

	public static boolean checkPrime(int num)
	{
		for (int i = 2; i < num/2; i++) 
		{
			if (num%i==0) 
			{
				return false;
			}
		}
		return true;
	}
}

