package Array;

import java.util.Scanner;

public class ArmstringNumber {

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
			checkArmstrongNumber(a[i]);
		}
}  
   public static void checkArmstrongNumber(int num)
   {   int sum=0;
	   int ct=0;
	   int q1=num;
	   int q2=num;
	   while(q1!=0)
	   {
		   q1/=10;
		   ct++;
	   }
	  // System.out.println(ct);
	   
	   while(q2!=0)
	   {
		   int rem=q2%10;
		   int pow=1;
		   for(int i=1;i<=ct;i++)
		   {
			   pow=pow*rem;
		   }
		   q2/=10;
		   sum=sum+pow;
	   }
	   if (sum==num) {
		System.out.println(num+" is Armstrong Number !!");
	}
   }
}
