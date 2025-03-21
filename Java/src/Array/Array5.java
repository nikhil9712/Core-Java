package Array;
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size1: ");
		int[]a=new int[sc.nextInt()];
		
		System.out.println("Enter the values : ");
		for(int i=0;i<a.length;i++)
		{   
			a[i]=sc.nextInt();
		}
		
		
	  int number=0;
	  int number2=0;

	 
		
		for(int i=0;i<a.length;i++)
		{   
			
			if(a[i]>number)
			{
				number=a[i];
				number2=number;
			
			}
			
		}
		System.out.println("The largest number in array is : "+number);
		
		for(int i=0;i<a.length;i++)
		{   
			
			if(a[i]<number2)
			{
				number2=a[i];
			}
			
		}
		
		
		System.out.println("The smallest number in array is : "+number2);
		
		
	}
}
