package Array;
import java.util.Scanner;
public class Array3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size: ");
	
	int []a=new int[sc.nextInt()];
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int sumEven=0;
	int sumOdd=0;
	for(int i=0;i<a.length;i++)
	{
		if (a[i]%2==0) {
			sumEven=sumEven+a[i];
		}
		else
		{
			sumOdd=sumOdd+a[i];
		}
	}
	System.out.println("sum of the Even numbers is : "+sumEven);
	System.out.println("sum of the Odd numbers is : "+sumOdd);
	
	
}
}
