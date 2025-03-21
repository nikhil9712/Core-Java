
public class Modulo {

	public static void main(String[] args) {
		int num=87654321;
		int rev=0;
        while (num!=0) {
            int x=(num/10)*10;
            int rem=num-x;
            rev=(rev*10)+rem;
            System.out.println(rem);
            num/=10;
		} 
        System.out.println(rev);

	}
	public static int power(int base,int raise)
	{
		int pow=1;
	     
	     for (int i = 0; i <raise; i++) {
			pow=pow*base;
		}
	     return pow;
	}
	public static int reverse(int num)
	{
		int rev=1;
		while (num!=0) {
			int rem=num/power(10, count(num));
			rev=(rev*10)+rem;
			num/=10;	
		}
		return rev;
		
	}
	public static int count(int num)
	{
		int ct=0;
		while (num!=0) {
			num/=10;
			ct++;
		}
		return ct;
	}
	
}
