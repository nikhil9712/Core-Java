package StringPractise;

public class PrintDuplicateString3 {

	public static void main(String[] args) {
		// Repeat
		String s="java and  javascript";
		
		char[]a=new char[s.length()];
		int[]b=new int[s.length()];
		
		for (int i = 0; i < a.length; i++)
		{
			a[i]=s.charAt(i);
		}
		String ans="";
		
		int ct=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			 {
				if (a[i]==a[j]) {
					ct++;
				}
			}
			b[i]=ct;
			ct=0;
		}
		
		for (int i = 0; i < b.length; i++)
		{
//			System.out.println(a[i]);
//			System.out.println(b[i]);
			if (b[i]>1) 
			{
				ans+=a[i];
			}
		}
		
		System.out.println(ans);
		
	}
	
	
}
