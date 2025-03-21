package Numbers;

public class Factors {

	public static void main(String[] args) {
		
		int num=100;
		int count=0;
		
		for (int j = 1; j <=num; j++) 
		{
			if (num%j==0)
			{
				count++;
			}
		}
		
		//System.out.println(count);
		
		int[]a=new int[count];
		
			for (int j = 1; j <=num; j++) 
			{    int index=0;
		         
				if (num%j==0)
				{
					System.out.println(index);
					a[index]=j;
					index+=1;
					System.out.println(j);
					
				}
				System.out.println("*********");
			
		}
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
	}
}
