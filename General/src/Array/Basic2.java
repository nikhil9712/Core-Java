package Array;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]a=new int[4];
		
		System.out.println("Enter values: ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//float type to char type
		
		System.out.println("Enter size: ");
       Float[]b=new Float[sc.nextInt()];
		
		System.out.println("Enter values: ");
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextFloat();
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
