package Inerview50;

import java.util.Iterator;

public class PatternPyramid {

	public static void main(String[] args) {
		
		int n=7;
		int space=n-1;
		int star=1;
		char ch='A';
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
             for (int j = 0; j < star; j++) {
				System.out.print(ch+" ");
				ch++;
			}
             System.out.println();
           star+=2;
           space--;
		}
	}
}
