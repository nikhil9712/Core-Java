package Question10;

public class SortArray {

	public static void main(String[] args) {
		
		int[]a= {5,4,1,88,6}; 
		        
		for (int i = 0; i < a.length-1; i++) 
		{ 
			for (int j = i+1; j < a.length; j++)
			{
				if (a[i]>a[j]) 
				{
					System.out.println(a[i]+" "+a[j]);
					int swap=a[j]; 
					int swap2=a[i];
					a[i]=swap;
				    a[j]=swap2;
					//System.out.println(swap+" "+swap2);
					System.out.println(a[i]+" "+a[j]);
				}
				System.out.println("******");
			}
			System.out.println("Outer");
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
}
