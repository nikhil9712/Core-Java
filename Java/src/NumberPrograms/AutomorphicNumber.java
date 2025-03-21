package NumberPrograms;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int num2=num*num;
		int q=num;
		int ct=0;
		while(num!=0)
		{
			num/=10;
			ct++;
		}
		int pow=1;
		int base=10;
		for(int i=1;i<=ct;i++)
		{
			pow=-pow*base;
		}
		if (num2%pow==q) {
			System.out.println("Automorphic number !!");
		} else {
           System.out.println("Not a Automorphic number !!");
		}
  }
}
