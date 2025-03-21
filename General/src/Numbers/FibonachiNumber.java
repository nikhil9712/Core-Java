package Numbers;

public class FibonachiNumber {

	public static void main(String[] args) 
	{
	    int num=51;
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		int i;
		for (i = 0; i <= num; i++) 
		{
			if (num==num1)
			{
				System.out.println(num+" is a fibonacchi number");
				break;
			}
			num1=num2;
			num2=num3;
			num3=num1+num2;
			
				
	     } 
		if (i!=num) 
		{
			System.out.println(num+" is not a fibonacchi number");	
		}
		
		
		}
	     
	  
		
	}

