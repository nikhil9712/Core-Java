package Inerview50;

public class Question8 {

	public static void main(String[] args) {
		
		
		String s="Ajay is a good boy";
		char[] charArray = s.toCharArray();
		String ans="";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]!=' ') {
				ans+=charArray[i];
			}
		}
		System.out.println(ans);
	}
}

