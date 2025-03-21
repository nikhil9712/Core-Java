package NumberProgramming;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int num2 = sc.nextInt();
		
		System.out.println("HCF of given number is : "+HCF(num1, num2));
		

	}

	public static int HCF(int num1,int num2) {
     int small=num1<num2?num1:num2;
     for (int i = small; i>=1; i--) {
		if (num1%i==0 && num2%i==0) {
			return i;
		}
	}
	return 0;
	}
}
