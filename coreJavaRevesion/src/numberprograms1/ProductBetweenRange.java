package numberprograms1;

import java.util.Scanner;

public class ProductBetweenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int start = sc.nextInt();

		System.out.println("Enter The Number");
		int end = sc.nextInt(); 

		int totalSum = 1;

		for (int i = start; i <= end; i++) {
			totalSum *= i;
		}
		
		System.out.println("The Total product Of Numbers between Number "+start+" to "+end +" is "+totalSum);

		sc.close();
	}
}
