package Inerview50;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		
		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				System.out.println("It is not a prime number");
				return;
			}
		}
		System.out.println("It is a Prime Number");
		
	}
}
