package Array;

import java.util.Scanner;

public class BouncyNumber {

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
			isBouncyNumber(a[i]);
		}
}  

  public static void isBouncyNumber(int num)
  {   int q=num; //1946
      boolean increase=false; //true
      boolean decrease=false; //true
	  while(num>9)
	  {   int last=num%10; //6 //4
	       num/=10; 
	      int slast=num%10;//4  //9
	      if (last>slast) {
			decrease=true;
		}
	      else if(last<slast)
	      {
	    	  increase=true;
	      }
	      if (decrease==true && increase==true) {
				break;
			}
	      
	  }
	  if (decrease==true && increase==true) {
			System.out.println(q+" is bouncy number !!");
		}
  }

}
