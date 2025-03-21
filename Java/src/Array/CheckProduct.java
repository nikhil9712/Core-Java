package Array;
import java.util.Scanner;
public class CheckProduct {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size: ");
		int a[]=new int[sc.nextInt()];
		
		System.out.println("Enter a value: ");  // 12,15,8,45,18
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int max= a[0];       // Integer.MIN_VALUE;
		int min =a[0];       // Integer.MAX_VALUE;
		int indexOfMax=0;
		int indexOfMin=0;
		for (int i = 1; i < a.length; i++)   //-1 , -20, 5, -1, -2, 2 
		{
			if (a[i]>max) 
			{
				max=a[i];
				indexOfMax=i;
			}
			else if(a[i]<min)
			{
				min=a[i];
				indexOfMin=i;
			}
		}
//		System.out.println("indexOfMin"+indexOfMin);
//		System.out.println("max"+max);  // what if we have two or more final max ???
//		System.out.println("min"+min);
		
		int finalMax=-(min)-max>0?min:max;
		int finalIndex=finalMax==max?indexOfMax:indexOfMin;
	//	System.out.println("finalMax"+finalMax);
		
		int product=1;
		
		for (int i = 0; i < a.length; i++) // int i = 0; i <= a.length-1; i++
		{
			if (i!=finalIndex) {          //1,314,314
				product=product*a[i];
				//System.out.println("product"+product);
			}
			
		}
	
		//System.out.println(product);
	    if (product==finalMax) {
			System.out.println(finalMax+" is that number !!");
		}
	    else
	    {
	    	System.out.println("Number not found !!");
	    }
	} 
}
