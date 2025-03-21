package NumberPrograms;

public class Amrstrong2 {

	public static void main(String[] args) {
		
		int num=153;
		int num1=num;
       System.out.println(power(2,4));
	
		int count1=count(153);
		System.out.println(count1);
		
		int total=0;

       while (num!=0) {
		int rem=num%10;
		
		num/=10;
	}
	
	}
	public static  int  power(int num,int raise)
	{
	int pow=1;
	
	for (int i = 0; i < raise; i++) {
		pow=pow*num;
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
