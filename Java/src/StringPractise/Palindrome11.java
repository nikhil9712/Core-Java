package StringPractise;

public class Palindrome11 
{
public static void main(String[] args)
{    //Perfect
	 String s="abcddcbaa";
	 char[]a=new char[s.length()];
	 
	 for (int i = 0; i < a.length; i++) 
	 {
		 a[i]=s.charAt(i);
		// System.out.println(a[i]);
	}
	 
	 String x="";
	 for (int i = a.length-1; i >= 0; i--)
	 {
		x+=a[i];
	}
	 
	 if (s.equals(x)) {
		System.out.println("Palindrome String");
	} else {
		System.out.println("Not a Palindrome String");
	}
}
}
