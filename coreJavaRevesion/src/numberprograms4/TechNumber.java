package numberprograms4;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;
		sc.close();
		
		int count=0;
		
		while (temp>0) {
			count++;
			temp/=10;
		}
		
		int power=1;
		

		for (int i = 1; i <= count/2; i++) {
			power=power*10;
		}
		
		int firstHalfNumber=number/power;
		int secondHalfNumber=number%power;
		
		
		int finalnumber=(firstHalfNumber+secondHalfNumber)*(firstHalfNumber+secondHalfNumber);
		
		if (number == finalnumber) {
			System.out.println(number + " is a Tech Number");
		} else {
			System.out.println(number + " is a Not Tech Number");
		}
		
		}
		
}
