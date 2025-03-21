package StringMethod2;

public class Equals {
public static void main(String[] args) {
	 String A="Nikhil";
	 String b="Nikhil"; 
	 String c="nikhil";
	 
	 System.out.println(A.equals(b)); //true
	 System.out.println(A.equals(c)); //false
	 System.out.println("******");
	 System.out.println(A.equalsIgnoreCase(b)); //true
	 System.out.println(A.equalsIgnoreCase(b)); //true
	 
	 String d="NIKHIL PRABHAKARRAO GULHANE";
	 
	System.out.println(d.indexOf("PRABHAKARRAO")); //TOTAL INDEX 7
	 
}
}
