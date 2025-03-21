package StringPractise;

public class CountOfNumberOfWords {

	public static void main(String[] args) {
		
		String s="God is great help a lot to me";
		
		char[]a=new char[s.length()];
		
		for (int i = 0; i < a.length; i++)
		{
			a[i]=s.charAt(i);
		}
		
		int ct=0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i]==' ') {
				ct++;
			}
		}
		System.out.println("The Number of the words in the given String are: "+ct);
	}
}
