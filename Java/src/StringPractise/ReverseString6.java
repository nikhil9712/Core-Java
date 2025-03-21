package StringPractise;

public class ReverseString6 
{
public static void main(String[] args)
{    //Perfect
	 String s="abcdefghijklmnopqrstuvwxyz";
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
	 
	 System.out.println(x);  //zyxwvutsrqponmlkjihgfedcba
}
}
