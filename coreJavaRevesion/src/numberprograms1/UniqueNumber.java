package numberprograms1;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumber {

	// If Sum and product Of All the Digits Of that Number is same
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<Integer> product = new HashSet<>();

		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int temp = number;
		int number1 = number;
		int size = 0;
		
		while (number > 0) {
			int rem = number % 10;
			size++;
			product.add(rem);
			number = number / 10;
		}

		if (product.size() == size) {
			System.out.println(temp + " is a Unique Number");
		} else {
			System.out.println(temp + " is a Not Unique Number");
		}
		
		
		if (isUnique(number1)) {
			System.out.println(temp + " is a Unique Number By Method As Well");
		} else {
			System.out.println(temp + " is a Not Unique Number By Method As Well");
		}
		
		
		
		// System.out.println(reverseNumber);

		sc.close();
	}
	
	public static boolean isUnique(int number) {
		boolean[] digitSeen = new boolean[10];

		while (number > 0) {
			int rem = number % 10;

			if (digitSeen[rem]) {
				return false;
			}
			
			digitSeen[rem] = true; 
			number = number / 10;
		}
		return true;
	}

}
