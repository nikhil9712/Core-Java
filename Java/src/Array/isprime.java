package Array;
import java.util.Scanner;
public class isprime {
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size1: ");
		int[]a=new int[sc.nextInt()];
		
		System.out.println("Enter the values : ");
		for(int i=0;i<a.length;i++)
		{   
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{   
			isPrime(a[i]);
		}
}
		
		public static void isPrime(int num)
		{
		    for(int i=2;i<num;i++)
		    {
		    	if (num%i==0) {
					return;
				}
		    }
		    System.out.println(num+" is Prime number !!");
		}
  
}