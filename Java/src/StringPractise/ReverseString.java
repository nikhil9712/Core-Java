package StringPractise;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		String s="java";
		char[]a=new char[s.length()];
		
		for (int i = 0; i < a.length; i++)
		{
			a[i]=s.charAt(i);
		}
		
		String ans="";
		for (int i = a.length-1; i >= 0; i--) 
		{
			ans+=a[i];
		}
		System.out.println(ans);
	}
}
