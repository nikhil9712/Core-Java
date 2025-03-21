package StringPractise;

public class StringToInteger14 {

	public static void main(String[] args) {
		
		String s="-123";
		char[]a=new char[s.length()];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.charAt(i);
		}
		String x="";
		for (int i = 0; i < a.length; i++) {
			if (a[i]!='+' && a[i]!='-') {
				x+=a[i];
			}
		}
		System.out.println(x);
	}
}
