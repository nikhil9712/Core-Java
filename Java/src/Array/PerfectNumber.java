package Array;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size1: ");
		int[]a=new int[sc.nextInt()];
		
		System.out.println("Enter the values : ");
		for(int i=0;i<a.length;i++)
		{   
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{   
			isPerfect(a[i]);
		}
}
	public static void isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)  //----> EXCLUDING NUMBER !!
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is perfect number !!");
		}
	}

}