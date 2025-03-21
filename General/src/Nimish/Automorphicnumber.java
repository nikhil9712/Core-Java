package Nimish;

public class Automorphicnumber {

	public static void main(String[] args) {
		int num=49;
	    int ct=count(num); //2
	    int square=num*num; //625
	    int lastdigits=square%power(10, ct);
	    System.out.println(ct+" "+square+" "+power(10, ct)+" "+lastdigits);
	   if(num==lastdigits)
	   {
		   System.out.println("Automorphic number !!");
	   }
	   else
	   {
		   System.out.println("Not a Automorphic number");
	   }
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
	public static int power(int base,int raise)
	{
	 int power=1;
	   for (int i = 0; i < raise; i++) {
		power=power*base;
	 }
	   return power;
	}
}
