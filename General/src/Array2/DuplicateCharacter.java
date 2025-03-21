package Array2;

public class DuplicateCharacter {

	public static void main(String[] args) {

		char[] a = { 'a', 'b', 'c','z','d', 'e', 'k', 's', 'h', 't' };
		int []b=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int ct=1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i]==a[j]) {
					ct++;
				}
				}
			if (ct>1) {
				System.out.println(a[i]);
				ct=1;
			}
			 

		}
		
	}
}
