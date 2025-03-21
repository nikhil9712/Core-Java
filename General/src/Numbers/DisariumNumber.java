package Numbers;

public class DisariumNumber {

	public static void main(String[] args) 
	{
		int num=175;
		int q=num;
		int sum=0;
		int ct=count(num);
		while (num!=0)
		{
			int rem=num%10;
			sum=sum+power(rem,ct);
			System.out.println(sum);
			num/=10;
			ct--;
		}
		System.out.println(sum);
		
		if (sum==q) {
			System.out.println("Disarium Number ");
		} else {
			System.out.println("Not Disarium Number ");
		}
		
	}
	
	public static int power(int base,int raise)
	{
		int pow=1;
		for (int i = 1; i <=raise; i++) 
		{
			pow=pow*base;
		}
		return pow;
	}
	
	public static int count(int num)
	{
		int ct=0;
		while (num!=0) 
		{
			num/=10;
			ct++;
		}
		return ct;
	}
}
