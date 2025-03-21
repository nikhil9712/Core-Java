package numberprograms4;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		//int temp = number;
		sc.close();
		//String revNumber="";
		
		//Integer temp=number%10;
		//revNumber += temp.toString();442
		//int temp
//		int revNumber=0;
//		  while(number > 0) {
//			  int reminder=number%10;
//			  revNumber=(revNumber*10)+reminder;
//			  number/=10;
//			  
//		  }
	    //String numberString=Integer.valueOf(number).toString();
		System.out.println(new StringBuffer(Integer.toString(number)).reverse());
		
		 // System.out.println(revNumber);

	}

}
