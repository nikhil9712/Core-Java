package StringMethod2;

public class CompareToString {

	static String A="dddd";
	static String B="ddda";
	static String c="Nikhil";
	static String d="NIKHIL";
	
	
	public static void main(String[] args) {
		System.out.println(A.compareTo(B)); // 3-->Add the ascii of all characters of two string and returns difference
		System.out.println(A.compareTo(c)); // 22
		
		System.out.println(A.compareToIgnoreCase(B)); // 3
		System.out.println(B.compareToIgnoreCase(A)); //-3
	}
}
