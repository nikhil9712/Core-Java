package Array;

import java.util.Scanner;

public class S {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		
		for (int i = 0; i < s.length() ;i++) {
			System.out.println(s.charAt(i)+" "+i+" "+s.length());
		}

		for (int i = 0; i < s.length(); i++) {
			int ct = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					ct++;
				}
			}

			if (ct == 1 && s.charAt(i) != ' ') {
				System.out.println("The character is "+s.charAt(i));
				break;
			}
		}
	}
}
