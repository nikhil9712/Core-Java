package NumberPrograms;
import java.util.Scanner;
public class primeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=sc.nextInt();
	boolean ans=true;
	for(int i=2;i<num;i++)
	{
		if (num%i==0) {
			ans =false;
			break;
		}
	}
	if (ans) {
		System.out.println(num+" is prime number !!");
	} else {
		System.out.println(num+" is not prime number !!");
	}
	
 }
}
