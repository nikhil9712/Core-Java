package NumberPrograms;

import java.util.Scanner;

public class CircularPrime {
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number1 : ");
		int num1=sc.nextInt(); 
		int num2=num1;
		
		int ct=0;
		while(num1!=0) //13
		{   
			num1/=10;
			ct++;
		}
		System.out.println(ct);
		int count=ct;
		int pow=1;
		int base=10;
		for(int i=1;i<=ct-1;i++)
		{
			pow=pow*base;
		}
		
		int ans=0;
		int ans2=0;
        
		for(int k=1;k<=ct;k++) //123  312  231
		{
			if(ans==ans2)
			{
				for(int j=2;j<num2;j++)
				{
					if (num2%j==0) {
						
						ans++;
						break;
						
					}
					
			
				num2=(num2%10)*pow+num2/pow;
			 }
			}
				
		}
		System.out.println(ans+" "+count);
		if (ans==0) 
		{
			System.out.println("It is a Circular prime number !!");
		} 
		else 
		{
			System.out.println("It is not a Circular prime number !!");
		}
 }
}
