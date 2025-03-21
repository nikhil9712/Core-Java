package Array;

import java.util.Scanner;

public class VovelsBySwitch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter character: ");
		int ch=sc.next().charAt(0);
		
		switch(ch)
		
		{
		 case'A':
		 case'E':
		 case'I':
		 case'O':
		 case'U':
		 case'a':
		 case'e':
		 case'i':
		 case'o':
		 case'u':
		 {
			 System.out.println("It is a vovel");
			 break;
		 }
		 default:
		 {
			 System.out.println("It is a consonent");
		 }
		}
		
		
	}
}
