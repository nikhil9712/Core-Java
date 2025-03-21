package Array;

import java.util.Scanner;

public class CountUpperLowerSpace {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = scanner.nextLine();

		int upperChars = 0;
		int lowerChars = 0;
		int spaces = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 91) {
				upperChars++;
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				lowerChars++;
			} else {
				spaces++;
			}
		}

		System.out.println("Total upper chars in the String is : " + upperChars);
		System.out.println("Total Lower chars in the String is : " + lowerChars);
		System.out.println("Total Spaces  in the String is : " + spaces);
	}
}
