package Array;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size: ");
		char[] a = new char[sc.nextInt()];

		System.out.println("Enter values: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println((int)a[i]);
		}
	}
}
