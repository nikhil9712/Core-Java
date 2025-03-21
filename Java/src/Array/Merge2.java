package Array;
import java.util.Scanner;
public class Merge2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter size: ");
	int size1=sc.nextInt();
	int[]a=new int[size1];      //4
	
	for(int i=0;i<a.length;i++) //3
	{
				a[i]=sc.nextInt();
	}
	
	System.out.println(" Enter size: ");
	int size2=sc.nextInt();
	int[]b=new int[size2]; //6
	
	for(int i=0;i<b.length;i++)  //5
	{
		b[i]=sc.nextInt();
	}
	
	int[]c=new int[size1+size2]; //10
	int length=a.length>b.length?a.length:b.length;
	
	int index=0;
	
	for(int i=0;i<length;i++)
	{
		if(i<a.length)
		{
			c[index++]=a[i];
		}
		if(i<b.length)
		{
			c[index++]=b[i];
		}
	}
	for(int i=0;i<c.length;i++)  //5
	{
		System.out.println(c[i]+" ");
	}
	
	
	
	
	
}
}
