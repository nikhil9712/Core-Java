package NumberProgramming;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int num2 = sc.nextInt();
		
		System.out.println("LCM of given number is : "+LCM(num1, num2));
		

	}

	public static int LCM(int num1,int num2) {
     int large=num1>num2?num1:num2;
     for (int i = large; i <=num1*num2; i++) {
		if (i%num1==0 && i%num2==0) {
			return i;
		}
	}
	return 0;
	}
}
