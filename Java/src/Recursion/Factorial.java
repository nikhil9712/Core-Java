package Recursion;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}
	public static int factorial(int num) //5,4
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return(num*factorial(num-1));
		}
	}
}
