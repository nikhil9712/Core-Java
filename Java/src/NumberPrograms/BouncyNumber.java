package NumberPrograms;
import java.util.Scanner;
public class BouncyNumber {
	public static void main(String[] args) 
	{   //First Number should be decrease and immediately increase !!
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		boolean increase=false;
		boolean decrease=false;
		while(num!=0)
		{
			int rem1=num%10;
			
			int rem2=num%100;
			if(rem1>rem2)
			{
				decrease=true;
			}
			
			else
			{
			increase=true;	
		    }
			if (decrease==true && increase==true) {
				break;
			}
			num/=10;
         }
		
		if (decrease==true && increase==true) {
			System.out.println("It is a  Bouncy Number !!");
		}
		else
		{
			System.out.println("Not a Bouncy Number !!");
		}

	}
}	 