package StringPractise;

public class RemoveGivenCharacter {

	public static void main(String[] args) {
		
		String s="Nikhil Gulhane";
		
		String ans=remove(s, 'a');
		
		 System.out.println(ans);
		 
		 
	}
	
	public static String remove(String s,char a)
	{
		String ans="";
		 char[]a1=new char[s.length()];
		 for (int i = 0; i < a1.length; i++) 
		 {
			 a1[i]=s.charAt(i);
			
		}
		 for (int i = 0; i < a1.length; i++)
		 {
			if (a1[i]!=a)
			{
				ans+=a1[i];
			}
		}
		 return ans;
	}
}
