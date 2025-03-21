package Numbers;

public class CoPrimeNumber {

	public static void main(String[] args) {
		
		int num1=21;
		int num2=17;
		
		int min=num1<num2?num1:num2;
		boolean ans=true;
		
		for (int i = min; i >1; i--) 
		{
			if (num1%i==0 && num2%i==0) 
			{
			 ans=false;	
			}
		}
		
		if (ans) 
		{
			System.out.println("coprime Number ");
		} else 
		{
          System.out.println("Not a coprime number");
		}
	}
}
