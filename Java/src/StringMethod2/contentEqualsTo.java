package StringMethod2;

public class contentEqualsTo {

	public static void main(String[] args) {
		 
		String A="NIKHIL";
		String b="NIKHIL";
		String c="nikhil";
		
		System.out.println(A.contentEquals(b)); //true
		System.out.println(A.contentEquals(c)); //false
	}
	
}
