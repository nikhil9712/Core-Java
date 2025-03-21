package Patterns;

public class Pattern4 {
public static void main(String[] args) {
	int n=30;
	int space=n-1; //4
	int star=1; //1
	
	for(int i=0;i<n;i++)  // i=8
	{
		for(int j=0;j<space;j++)
		{	
			System.out.print("  ");
		}
		for(int j=0;j<star;j++)
		{
			System.out.print("* ");
		}
		
			space--;
			star=star+2;
		
		
		System.out.println();
	}
 }
}


