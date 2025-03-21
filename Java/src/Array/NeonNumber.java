package Array;

import java.util.Scanner;

public class NeonNumber {

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
			isNeon(a[i]);
		}
}  

  public static void isNeon(int num)
  {
	  int sum2=num*num;
	 
	  int sum=0;
	  while(sum2!=0)
	  {
		  int rem=sum2%10;
		  sum=sum+rem;
		  sum2/=10;
	  }
	  if (sum==num) {
		System.out.println(num+" is neon number !!");
	}
  }
}
