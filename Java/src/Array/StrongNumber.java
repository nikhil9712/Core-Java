package Array;

import java.util.Scanner;

public class StrongNumber {
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
			isStrongNUmber(a[i]);
		}
}  
   public static void isStrongNUmber(int num)
   {
	int sum=0;
	int q=num;
	while(q!=0)
	{
		int rem=q%10;
		int fact=1;
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		q/=10;
	}
	if (num==sum) {
	System.out.println(num+" is Strong Number !!");	
	}
   }
}
