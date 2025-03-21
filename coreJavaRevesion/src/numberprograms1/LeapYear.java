package numberprograms1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Year");
		int year = sc.nextInt();

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a Leap year");
		} else {
			System.out.println(year + " is a Not Leap Year");
		}

		sc.close();
	}

} 
