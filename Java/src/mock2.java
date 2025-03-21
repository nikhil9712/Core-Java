import java.util.ArrayList;

public class mock2 {
 
	public static void main(String[] args) {
		
		String s1="hack";
		String s2="hackerrank";
		String s3="hackhackerrank";
		
		ArrayList<Character> a=new ArrayList<>();
		
		for (int i = 0; i < s1.length(); i++) {
			a.add(s1.charAt(i));
		}
		

		for (int i = 0; i < s2.length(); i++) {
			a.add(s1.charAt(i));
		}
		

		for (int i = 0; i < s3.length(); i++) {
			a.add(s1.charAt(i));
		}
		
		for (Character character : a) {
			System.out.println(character);
		}

		
		
		
		
		
	}
}
