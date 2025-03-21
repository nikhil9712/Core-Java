package StringPractise;

public class RotationsOfEachOthers5 {

	public static void main(String[] args) {
		
		String s1="XYZ";
		String s2="ZXY";
		String s3="YZX";
		
		char[]a=new char[s1.length()];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=s1.charAt(i);
		}
		String ans=""+a[a.length-1];
		
		for (int i = 0; i < a.length-1; i++) {
			ans=ans+a[i];
			
		}
		
		boolean ans1=compareStrings(ans, s2); 
		System.out.println(ans1);
	
		boolean ans2=compareStrings(ans, s3);
		System.out.println(ans2);
	}
	
	public static boolean compareStrings(String X,String Y)
	{   
		boolean A;
		if (X.equals(Y)) {
			A=true;
			
		} else {
         A=false;
		}
		return A;
	}
}
