package NumberPrograms;
import java.util.Scanner;
public class NeonNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=sc.nextInt();
    int num2=num*num;

    int sum=0;
    while(num2!=0)
    {
    	int rem=num2%10;
    	sum=sum+rem;
    	num2/=10;
    	
    }
    System.out.println(sum);
    if (sum==num) {
		System.out.println("It is a Neon Numbeer !!");
	} else {
		System.out.println("It is not Neon Numbeer !!");
	}
		
 }
}