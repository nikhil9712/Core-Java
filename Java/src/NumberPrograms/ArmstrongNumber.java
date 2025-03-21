package NumberPrograms;
import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=sc.nextInt();
	int num2=num;
	int q=num;
	int ct=0;
	while(num!=0)
	{
		num/=10;
		ct++;
	}
	System.out.println(ct);
	int sum=0;
	while(num2!=0)
	{
		int rem=num2%10;
		int pow=1;
		for(int i=0;i<ct;i++)
		{
			pow=pow*rem;
		}
		num2/=10;
		sum=sum+pow;
	}
	System.out.println(sum);
	if (sum==q) {
		System.out.println("An Armstrong number !!");
	} else {
		System.out.println(" Not An Armstrong number !!");
	}
}
}
