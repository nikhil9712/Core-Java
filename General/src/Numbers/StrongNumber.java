package Numbers;

public class StrongNumber {

	public static void main(String[] args) {
		
		int num=145;
		int q=num;
		int sum=0;

		while (num!=0) 
		{
		    int rem=num%10;
		    int fact=1;
		    
		    for (int i = 1; i <=rem; i++)
		    {
				fact*=i;
			}
		    System.out.println(fact);
		    sum+=fact;
		    fact=1;
		    num/=10;
			
		}
	
		
		
		System.out.println(sum);
		
		
		if (sum==q) {
			System.out.println("Strong Number !!");
		} else {
           System.out.println("not a Strong Number !!");
		}
	}
}
