package Array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		
		char[]a=new char[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{

			 if(a[i]=='A' || a[i]=='a' ||a[i]=='E' ||a[i]=='e' ||a[i]=='I' ||a[i]=='i' ||a[i]=='O' ||a[i]=='o' ||a[i]=='U' ||a[i]=='u' )
			 {
				 count++;
			 }
		}
		System.out.println("The count of vovels in the array is : "+count);
       		
		
	}	 
}
