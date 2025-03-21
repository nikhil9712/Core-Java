package Array;

import java.util.Scanner;

public class XyloemPhyloem {

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
			isXyloemPhyloem(a[i]);
		}
}  

 public static void isXyloemPhyloem(int num)
 {
	 int sum1=0;
	 int sum2=0;
	 int num2=num/10;
	 int num3=num;
	 int rev=0;
	 while(num!=0)
	 {
		 int rem=num%10;
		 rev=(rev*10)+rem;
		 num/=10; 
		 
	 }
	  sum1=(rev%10)+(num3%10);
	  while(num2>9)
	  {
		  int rem=num2%10;
		  sum2=sum2+rem;
		  num2/=10;
	  }
	 System.out.println(sum1);
	 System.out.println(sum2);
	 if (sum1==sum2) {
		System.out.println(num3 +" is Xyloem number !!");
	} else {
		System.out.println(num3 +" is Phyloem number !!");
	}
	 
	 
 }
}
