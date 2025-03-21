package Abstraction;


public class n1 {
 public static void main(String[] args) {
	System.out.println(power(4,3));
	System.out.println(count(24545));
 }
	 public static int power(int base,int raise)
	 {
		int pow=1;
		for (int i = 0; i < raise; i++) {
			pow=pow*base;
		}
		return pow;
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