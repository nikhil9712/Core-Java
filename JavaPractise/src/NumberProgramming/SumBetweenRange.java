package NumberProgramming;

import java.util.Scanner;

public class SumBetweenRange {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter upper range: ");
        int start=sc.nextInt();
        System.out.println("Enter lower range: ");
        int end=sc.nextInt();
        int total=0;
        for (int i = start;i <=end; i++) {
			total+=i;
		}
        System.out.println("The total between "+start+" and "+end+" is "+total);
       
	}
}
