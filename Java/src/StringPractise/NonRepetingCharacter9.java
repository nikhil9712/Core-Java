package StringPractise;

public class NonRepetingCharacter9{

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyzabcdefghijklm";
		 char[]a=new char[s.length()];
		 
		 for (int i = 0; i < a.length; i++) 
		 {
			 a[i]=s.charAt(i);
			// System.out.println(a[i]);
		}
		 
		 for (int i = 0; i < a.length; i++) 
		 {  int ct=0;   // a[i]=1
		 
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i]==a[j]) 
				{
					ct++;
				}
			}
			if (ct==1) 
			{
				System.out.println(a[i]);
			}
			//System.out.println(ct+" "+a[i]+" "+i); // -->important concept line
			ct=0;
		}
	}
}
