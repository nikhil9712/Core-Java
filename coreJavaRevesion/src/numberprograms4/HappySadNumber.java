package numberprograms4;

import java.util.HashSet;
import java.util.Scanner;

public class HappySadNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int temp = number;
		sc.close();

		if (isHappy(number)) {
			System.out.println("The Number "+ temp+" is a Happy number");
		} else {
			System.out.println("The Number "+ temp+" is not a Happy number");
		}
		
	}

	public static int getSquareNumber(int number) {
		int answer = 0;
		while (number > 0) {
			int rem = number % 10;
			answer = answer + rem * rem;
			number /= 10;
		}
		return answer;
	}
	
	public static boolean isHappy(int number) {
		boolean ans=true;
		HashSet<Integer> hashSet = new HashSet<>();
		while (ans) {
			int squareNumber = getSquareNumber(number);
			if (squareNumber==1) {
				return true;
			}
			else if (hashSet.contains(squareNumber)) {
				ans=false;
			} 
			number=squareNumber;
			hashSet.add(squareNumber);
		}
		return ans;
	}
	
}
