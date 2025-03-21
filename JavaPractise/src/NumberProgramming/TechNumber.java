package NumberProgramming;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		if (isTech(num)) {
			System.out.println("The Given Number is a tech number !!");
		}
		else
		{
			System.out.println("The Given Number is not a tech number !!");
		}
	}

	public static boolean isTech(int num)
	{
	   	int count=count(num);
	   	int end=num%power(10, count/2);
	   	int start=num/power(10,count/2);
	   	int sum=start+end;
	   	int square=sum*sum;
	   	if (square==num) {
			return true;
		} else {
             return false;
		}
	   	
	}

	public static int count(int num) {
		int ct = 0;
		while (num != 0) {
			num /= 10;
			ct++;
		}
		return ct;
	}

	public static int power(int num, int raise) {
		int pow = 1;
		for (int i = 1; i <= raise; i++) {
			pow = pow * num;
		}
		return pow;
	}
}
