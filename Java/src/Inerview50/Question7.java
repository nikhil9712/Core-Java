package Inerview50;

public class Question7 {

	public static void main(String[] args) {
		
		String s="ABAn";
		String ans="";
		
		for (int i = s.length()-1; i >=0; i--) {
			ans+=s.charAt(i);
		}
		if (s.equals(ans)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
