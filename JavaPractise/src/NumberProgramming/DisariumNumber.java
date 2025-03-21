package NumberProgramming;

import java.util.Scanner;

public class DisariumNumber {

	 public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter num: ");
			int num=sc.nextInt();
			if (DisariumNumber(num)) {
				System.out.println("The Entered Number is DisariumNumber Number !!");
			} else {
				System.out.println("The Entered Number is not a DisariumNumber Number !!");
			}
	}
	   public static boolean DisariumNumber(int num)
	   {   int ip=num;
		   int count=count(num);
		   int ans=0;
		   while(num>0)
		   {
			  int rem=num%10;
			  ans+=power(rem,count);
			  num/=10;
			  count--;
		   }
		   if (ans==ip) {
			return true;
		} else {
	       return false;
		}
	   }
	   public static int power(int num,int raise)
		{
			int pow=1;
			for (int i = 1; i <=raise; i++) {
				pow=pow*num;
			}
			return pow;
		}
	   public static int count(int num)
		{
			int ct=0;
			while(num!=0){
				num/=10;
				ct++;
			}
			return ct;
		}
}
