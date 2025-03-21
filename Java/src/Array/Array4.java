package Array;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size: ");
		int[]a=new int[sc.nextInt()];
		
		System.out.println("Enter the values : ");
		for(int i=0;i<a.length;i++)
		{   
			a[i]=sc.nextInt();
		}
		
		
	  int number=0;
		for(int i=0;i<a.length;i++)
		{   
			
			if(a[i]>number)
			{
				number=a[i];
			}
			
		}
		
		
		for(int i=0;i<a.length;i++)
		{   
			
			if(a[i]<number)
			{
				number=a[i];
			}
			
		}
		
		System.out.println("The smallest number in array is : "+number);
		
		
	}
}
