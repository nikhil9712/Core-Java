package Recursion;

public class FibonacchiSeries {

	static int num1=0;
	static int num2=1;
	static int num3=0;
	public static void fibonacchi(int count)
	{   
		if (count>0) {
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.println(num3);
			fibonacchi(count-1);
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println(num2);
		int count=15;
		fibonacchi(count-2);
		System.out.println(fact(5));
	}
	
	public static int fact(int num)
	{
	    if (num==1) {
		  return 1;	
		}
	    else
	    {
	    	return (num*fact(num-1));
	    }
	    
	}
}
