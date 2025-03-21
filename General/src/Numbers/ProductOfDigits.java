package Numbers;

public class ProductOfDigits {

	public static void main(String[] args) {
		
		int num=12345;
		int product=1;
	
		while (num!=0)
		{
			int rem=num%10;
			
			product=product*rem;
			num=num/10;
		}
		
		System.out.println("The product of given numbers digit is: "+product);
	}
}
