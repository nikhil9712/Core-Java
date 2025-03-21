package NumberPrograms;
import java.util.Scanner;
public class XyloemPhyloem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=sc.nextInt();
	int num2=num;
	int num3=num2/10;
	
	int rev=0;
	while(num!=0)
	{
		int rem=num%10;
		rev=(rev*10)+rem;
		num/=10;
	}
	int sum1=(num2%10)+(rev%10);
	
	int sum2=0;
	
	while(num3>9)
	{
		int rem=num3%10;
		sum2=sum2+rem;
		num3/=10;
	}
	System.out.println(sum1);
	System.out.println(sum2);
	if (sum1==sum2) 
	{
		System.out.println("it is a Xyloem number !!");
	} else
	{
		System.out.println("it is a Pyloem number !!");
	}
			
  }
}
