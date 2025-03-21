package Patterns;

public class Pattern2 {
public static void main(String[] args) {
	int n=29;
	int space=n/2; //4
	int star=1; //1
	
	for(int i=0;i<n;i++)  // i=8
	{
		for(int j=0;j<space;j++)      // 0 0 0 0 *
			                          // 0 0 0 * * *
		{                             // 0 0 * * * * *
			                          // 0 * * * * * * * 
			                          // * * * * * * * * *
			                          // 0 * * * * * * *
			                          // 0 0 * * * * *
			                          // 0 0 0 * * *
			                          // 0 0 0 0 *
			System.out.print("  ");
		}
		for(int j=0;j<star;j++)
		{
			System.out.print("* ");
		}
		if(i<n/2)   //3<4
		{
			space--;
			star=star+2;
		}
		
		if(i>=n/2)   //8>4
		{
			space++;
			star=star-2;
		}
		System.out.println();
	}
}
}
