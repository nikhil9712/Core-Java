package Array;
import java.util.Scanner;
public class ArrayMerge {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter size: ");
    int size1=sc.nextInt();
    int[]a=new int[size1];
    
    for (int i=0;i<a.length;i++)
    {
		a[i]=sc.nextInt();
		
	}
    System.out.println("enter size : ");
    int size2=sc.nextInt();
    int[]b=new int[size2];
    
    for (int i=0;i<b.length;i++) 
    {
		b[i]=sc.nextInt();
	}
    
    int[]c=new int[a.length+b.length];
    int length=a.length>b.length?a.length:b.length;
    int index=0;
    
    for(int i=0;i<length;i++)
    {
    	if(i<a.length)
    	{
    		c[index++]=a[i]; //index ++ to avoid assigning the value to the same index and moving the courser !!
    	}
    	if(i<b.length)
    	{
    		c[index++]=b[i];
    	}
    }
    for(int i=0;i<c.length;i++)
    {
    	System.out.println(c[i]+" ");
    }
    
}
}
