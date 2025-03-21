package NumberProgramming;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		if (isAutomorphic(num)) {
			System.out.println("It is a Automorphic number");
		} else {
			System.out.println("It is not a Automorphic number");
		}
	}

	private static boolean isAutomorphic(int num) {
		int count=count(num);
		int square=num*num;
		int lastTwo=square%power(10,count);
				
		if (num==lastTwo) {
			return true;
		} else {
          return false;
		}
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
	public static int power(int num,int raise)
	{
		int pow=1;
		for (int i = 1; i <=raise; i++) {
			pow=pow*num;
		}
		return pow;
	}
}
