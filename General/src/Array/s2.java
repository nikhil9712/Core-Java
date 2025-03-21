package Array;

public class s2 {

	public static void main(String[] args) {
		
		String s="hello world hi hey";
		int ct=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				ct++;
			}
			
		}
		
		int[]a=new int[ct];
		int index=0;
		for (int i = 0; i < s.length(); i++) {
			int ct2=0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j) ) {
					ct++;
				}
				if (s.charAt(i)!=' ') {
					a[index]=ct;
					index++;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
