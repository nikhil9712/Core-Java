package StringPractise;

public class FirstNonRepetedChar{

	public static void main(String[] args) {
		
		String s="aaaaaaac";
		char[]A=StringTocharArray(s);
		
		char ans=checkArray(A);
		System.out.println(ans);
		
//		for (int i = 0; i < A.length; i++) 
//		{
//			System.out.println(A[i]);
//		}
	}
	
	public static char[] StringTocharArray(String x)
	{   char[]a=new char[x.length()];
		for (int i = 0; i < x.length(); i++) 
		{    
			if (x.charAt(i)>='A' && x.charAt(i)<='Z') 
			{
			a[i]=(char)(x.charAt(i)+32);
			} 
			else 
			{
				a[i]=x.charAt(i);
			}
		}
		return a;
	}
	
	public static char checkArray(char[]x)
	{   
		for (int i = 0; i < x.length; i++) 
		{  
			
			for (int j = i+1; j < x.length-1; j++) 
			{
				if(x[i]==x[j])
				{  
					 break;
				}
			}
			
			
		}
		return 0; 
		
	}
}
