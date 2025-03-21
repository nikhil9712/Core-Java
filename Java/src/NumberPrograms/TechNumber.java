package NumberPrograms;
import java.util.Scanner;
public class TechNumber {
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int num2=num;
		int ct=0;
		while(num!=0)
		{
			num/=10;
			ct++;
		}
		
		int pow=1; 
		int base=10;
		for(int i=1;i<=ct/2;i++)
		{
			pow=pow*base;
		}
		
		if (ct%2==0)
		{   int sum;
			int A=num2%pow;
			int B=num2/pow;
			sum=A+B;
			int square=sum*sum;
			
			if (square==num2)
			{
				System.out.println("It is a tech Number !!");
			} 
			else 
			{
				System.out.println("It is not tech Number !!");
			}
			
		 }
	 	
		else  
		{
        System.out.println("It has not a Even count !!");
		}
  }
}