package StringPractise;

public class count {

	public static void main(String[] args) {
		char[]a= {'a','a','f','h','h','h','h','u'};
		int []b=count1(a);
		System.out.println(b[3]);
	}
	public static int[] count1(char[]a)
	{   int[]ct=new int[a.length];
	    int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i]==a[j]) {
					count++;
				}
			}
			ct[i]=count;
			count=0;
		}
		return ct;
	}
}
