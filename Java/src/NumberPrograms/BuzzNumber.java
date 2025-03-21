package NumberPrograms;
import java.util.Scanner;
public class BuzzNumber {
	public static void main(String[] args) 
	{   // the last num should be 7 or number should be divisible by 7 !1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int rem=num%10;
		if(num/7==0 || rem==7)
		{
		System.out.println("It is a Buzz Number !!");	
		}
		else
		{
			System.out.println("Not a Buzz Number !!");
		}
        
	}
}