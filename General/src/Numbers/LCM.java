package Numbers;

public class LCM {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=7;
		
	    int max=num1>num2?num1:num2;
	    
	    for (int i = max; i <=num1*num2; i++) 
	    {
			if (i%num1==0 && i%num2==0)
			{
				System.out.println("The LCM of given number is : "+i);
				break;
			}
		}
	}
}
