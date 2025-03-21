package Question10;

public class Occurences {

	public static void main(String[] args) {
		
		int[]a= {3,1,2,4,5,2,3,6,2,2};
		int[]b=new int[a.length];
		
		for (int i = 0; i < a.length; i++) 
		{
			int ct=0;
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i]==a[j])
				{
					ct++;
				} 
				
			}
			b[i]=ct;
			ct=0;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("The count of "+a[i]+" is "+b[i]);
		}
	}
}
