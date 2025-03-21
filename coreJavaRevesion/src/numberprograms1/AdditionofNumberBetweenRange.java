package numberprograms1;

import java.util.Scanner;

public class AdditionofNumberBetweenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int start = sc.nextInt();

		System.out.println("Enter The Number");
		int end = sc.nextInt();

		int totalSum = 0;

		for (int i = start; i <= end; i++) {
			totalSum += i;
		} 
		
		System.out.println("The Total Sum between Number "+start+" to "+end +" is "+totalSum);

		sc.close();
	}
}
