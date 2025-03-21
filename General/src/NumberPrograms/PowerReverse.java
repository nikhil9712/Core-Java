package NumberPrograms;
import java.util.Scanner;
public class PowerReverse {
	
	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num=sc.nextInt();
		
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of given number is: "+fact);
	}	
}
