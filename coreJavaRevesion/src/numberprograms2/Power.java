package numberprograms2;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//2*5 2*2*2*2*2*

		System.out.println("Enter The Number");
		int number = sc.nextInt();

		System.out.println("Enter The Raise Number");
		int raise = sc.nextInt();
		
		int power=1;
		
		for (int i = 1; i <=raise ; i++) {
			power=power*number;
		}
		
		System.out.println("The "+number+ " To The Power "+raise+ " is : "+power);
		
		sc.close();

	}
}
