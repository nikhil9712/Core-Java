package Array;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[]a={1,2,3,4,5,6,7,8,1,2};
		
		int size=0;
		
		int min=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) 
		{
		   for (int j = i+1; j < a.length-1; j++) 
		   {
			if (a[i]==a[j]) 
			{
			  a[i]=min;	
			} 
		}
		}
		

		  for (int j = 0; j < a.length; j++)
		  {
			System.out.println(a[j]);
		}
		
		
		
		
	}
}
