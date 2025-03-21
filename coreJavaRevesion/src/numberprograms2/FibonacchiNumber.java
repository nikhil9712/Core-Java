package numberprograms2;

import java.util.Scanner;

public class FibonacchiNumber {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34 55

		Scanner sc = new Scanner(System.in);

		int firstNumber = 0; //0 1

		int secondNumber = 3; //1 

		int temp;
		System.out.println("Enter The Number ");

		int number = sc.nextInt();

	//	System.out.print(firstNumber+" ");
		
		while (firstNumber <= number) {
			System.out.print(firstNumber+" ");
			temp=firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp + secondNumber;
		}

		sc.close();
	}
}
