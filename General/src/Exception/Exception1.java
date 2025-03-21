package Exception;
import java.util.Scanner;
public class Exception1 
{
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number1 : ");
	int a=sc.nextInt();
	
	System.out.println("Enter number1 : ");
	int b=sc.nextInt();
	
	/*try 
	{
		int ans=a/b;
		System.out.println(ans);
	}
	catch (ArithmeticException e) 
	{
		System.out.println("Dont divide a number by 0 !!");
	}
	*/
	
	int ans=a/b;
	System.out.println(ans);

	
}
}
