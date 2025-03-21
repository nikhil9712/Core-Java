package NumberPrograms;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		System.out.println("Enter raise: ");
		int raise=sc.nextInt();
		int pow=1;
		for(int i=1;i<=raise;i++)
		{
			pow=num*pow;
		}
		System.out.println(" power of the given number is : "+pow);
	}	
}
