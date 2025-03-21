package Numbers;

public class UniqueNumber {

	public static void main(String[] args) {
		
		int num=123;
		int sum=0;
		int product=1;
	
		while (num!=0)
		{
			int rem=num%10;
			product=product*rem;
			sum=sum+rem;
			num=num/10;
		}
		
		if (sum==product) 
		{
			System.out.println("The Number is Unique Number !!");
		} else 
		{
			System.out.println("The number is not a unique number !!");
		}
	}
}
