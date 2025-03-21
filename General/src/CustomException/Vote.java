package CustomException;

import java.util.Scanner;

public class Vote {
 
	public static void main(String[] args) throws UnderAgeException{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		try {
			if (age>18) {
				System.out.println("You can vote");
			} else {
	            throw new UnderAgeException();
			}
		} catch (UnderAgeException e) {
			System.out.println("catch : can not vote");
			e.printStackTrace();
		}
		System.out.println("End");
	}
	
	
}
