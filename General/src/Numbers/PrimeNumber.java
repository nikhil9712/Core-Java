package Numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=63;
		boolean ans=false;
		
		for (int i = 2; i <=num/2; i++)
		{
			if (num%i==0)
			{
				ans=true;
			}
		}
		
		if(ans==true) 
		{
			System.out.println(num+" is not prime number !!");
		}
		else 
		{
			System.out.println(num+" is  a prime number !!");
		}
	}
}
