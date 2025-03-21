package String;

public class S2 {

	
	
public static void main(String[] args) {
    String s1="Aniket";
	
	String s2="Nikhil";
	
	String s3="Aniket";
	
	System.out.println(s1.toString()); //Aniket
	System.out.println(s2.toString());  //Nikhil
	System.out.println(s3.toString());   //Aniket
	System.out.println("****************");
	
	System.out.println(s1.equals(s2)); //false
	System.out.println(s2.equals(s3));  //false
	System.out.println(s1.equals(s3));  //true
	System.out.println("****************");
	
	System.out.println(s1==s2); //false
	System.out.println(s2==s3); //false
	System.out.println(s1==s3); //true
	System.out.println("****************");
	
	System.out.println(s1.hashCode());  
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println("****************");
	
}
}
