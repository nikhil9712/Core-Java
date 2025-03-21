package Nimish;

public class Reverse {

	public static void main(String[] args) {
		
		int num=123456789;
		
		int rev=0;
	    while (num!=0) {
			int x=num/10;
			int x2=x*10;
			int rem=num-x2;
			rev=(rev*10)+rem;
			num/=10;
		}
	    System.out.println(rev);
	    
				
	}
}
