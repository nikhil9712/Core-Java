package Numbers;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		System.out.println("Enter Raise: ");
		int raise=sc.nextInt();
		int pow=1;
		
		for (int i = 1; i <= raise; i++) 
		{
			pow=pow*num;
		}
		
		System.out.println("The power of given number is: "+pow);
	}
}
