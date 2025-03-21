package NumberProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		ArrayList<Integer> arrayList=factors(num);
		System.out.println("The Factors of given number are: ");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}
	public static ArrayList<Integer> factors(int num)
	{
		ArrayList<Integer> arrayList=new ArrayList<>();
		for (int i = 1; i <=num/2; i++) {
			if (num%i==0) {
				arrayList.add(i);
			}
		}
		arrayList.add(num);
		return arrayList;
	}
}
