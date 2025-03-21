package NumberPrograms;
import java.util.Scanner;
public class DisariumNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=sc.nextInt();
	int num2=num;
	int q=num;//175
	int ct=0;//3
	while(num!=0)
	{
		num/=10;
		ct++;
	}
	System.out.println(ct);
	int sum=0; //0
	while(num2!=0)
	{
		int rem=num2%10; //5
		int pow=1; 
		for(int i=0;i<ct;i++)
		{
			pow=pow*rem;
			
		}
		ct--;
		num2/=10;
		sum=sum+pow;
	}
	System.out.println(sum);
	if (sum==q) {
		System.out.println("An Disarium number !!");
	} else {
		System.out.println(" Not An Disarium number !!");
	}
}
}
