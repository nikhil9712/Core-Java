package StringPractise;

public class MaxChar1 {

	public static void main(String[] args) 
	{
		
		String s="ikhilkikdjgniknflchgikccgitchi";
		
		char[]A=new char[s.length()];
		
		int[]B=new int[s.length()];
		
		for (int i = 0; i < A.length; i++) 
		{
			A[i]=s.charAt(i); //char AT Methd is designed by converting String to Array 
		}
		for (int i = 0; i < A.length; i++) 
		{
		    int ct=0;
			for (int j = 0; j < A.length; j++) 
			{
				if (A[i]==A[j]) 
				{
				  ct++;	
				}
				
			}
			B[i]=ct;
			ct=0;
		}
		
		
		int max=B[0];
		int index=0;
		
		for (int i = 0; i < B.length; i++) {
			if (B[i]>max) {
				max=B[i];
				index=i;
			}
		}
	
		System.out.println("The maximum repeteed character in the String is: "+A[index]);
		
		
	}
	
	
}
