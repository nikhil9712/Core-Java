package Numbers;

public class HCF {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
	    int min=num1<num2?num1:num2;
	    
	    for (int i = min; i >=1; i--) 
	    {
			if (num1%i==0 && num2%i==0)
			{
				System.out.println("The HCF of given number is : "+i);
				break;
			}
		}
	}
}
