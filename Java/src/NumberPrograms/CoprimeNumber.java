package NumberPrograms;

import java.util.Scanner;

public class CoprimeNumber {
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number1 : ");
		int num1=sc.nextInt(); //13
		System.out.println("Enter a number2 : ");
		int num2=sc.nextInt(); //15
		
		int min=num1<num2?num1:num2;
		boolean ans =true;
		
		for(int i=min;i>1;i--)
		{
			if (num1%i==0 &&num2%i==0) {
				ans =false;
				break;
			}
		}
		
		if (ans)
		{
			System.out.println(num1+" and "+num2+" are co-prime Number !!");
		} 
		else
		{
			System.out.println(num1+" and "+num2+" are not co-prime Number !!");
		}
		
  }
}
