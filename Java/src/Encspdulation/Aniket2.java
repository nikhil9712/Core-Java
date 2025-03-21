package Encspdulation;
import java.util.Scanner;
public class Aniket2 {

	public static void main(String[] args) {
		
		//first way to create Array
//		int a[]= {1,2,3,4,5};
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		//System.out.println(a[5]);
//		System.out.println("+++++++++++++++++");
//		System.out.println(a.length);
//		System.out.println(a);
//		System.out.println(a.toString());
//		System.out.println(a.equals(a.toString()));
//		System.out.println(a.toString().hashCode());
//		System.out.println(a.hashCode()+"hashcode");
//		
		//second way to create 
		
//		int b[]=new int[sc.nextInt()];
//		b[0]=10;
//		b[1]=12;
//		b[2]=14;
//		b[3]=16;
//		//b[4]=18;
//		
//		System.out.println("Enter IndexValue");
//		System.out.println(b[sc.nextInt()]);
//		System.out.println("Enter IndexValue");
//		System.out.println(b[sc.nextInt()]);
//		System.out.println("Enter IndexValue");
//		System.out.println(b[sc.nextInt()]);
//		System.out.println("Enter IndexVlue");
//		System.out.println(b[sc.nextInt()]);
//		System.out.println("Enter IndexValue");
//		System.out.println(b[sc.nextInt()]);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		//int[]c=new int[sc.nextInt()];
		int[] d=new int[sc.nextInt()];
		//int[]e=new int[d.length];
		for(int i=0;i<d.length;i++)
		{   
			System.out.println("Enter IndexValue");
			d[i]=sc.next().charAt(0);
			
		}
		for(int i=0;i<d.length;i++)
		{   
			System.out.print(d[i]+" ");
			
			
		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
