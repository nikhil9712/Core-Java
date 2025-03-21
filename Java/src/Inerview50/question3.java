package Inerview50;

public class question3 {

	public static void main(String[] args) {
		
		String a="abcde";
		String b="bcdfgh";
		System.out.println(isContain(a));
		System.out.println(isContain(b));
	}
	public static boolean isContain(String s)
	{
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='a' ||s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') {
				return true;
			}
		}
		return false;
	}
}
