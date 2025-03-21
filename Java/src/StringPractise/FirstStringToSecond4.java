package StringPractise;

public class FirstStringToSecond4 {

	public static void main(String[] args) {
		
		String s1="nikhilgtdgtd Ggulhane";
		String s2="tD";
		
		char[]c1=new char[s1.length()];
		char[]c2=new char[s2.length()];
		
	    
		for (int i = 0; i < c1.length; i++) 
		{
			if (s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				c1[i]=(char)(s1.charAt(i)+32);
			}
			else
			{
				c1[i]=s1.charAt(i);
			}
		}
		
		for (int i = 0; i < c2.length; i++) 
		{
			if (s2.charAt(i)>='A' && s2.charAt(i)<='Z')
			{
				c2[i]=(char)(s2.charAt(i)+32);
			}
			else
			{
				c2[i]=s2.charAt(i);
			}
		}
		
		
	    
	    String s="";
	    for (int i = 0; i < c1.length; i++) 
	    {
	    	boolean ans=true;
	    	for (int j = 0; j < c2.length; j++)
	    	{
				if (c1[i]==c2[j]) 
				{
					ans=false;
					break;
				}
			}
	    	if (ans==true)
	    	{
				s+=c1[i];
				ans=false;
			}
		}
	    System.out.println(s); //inia is rea

	}
	
}
