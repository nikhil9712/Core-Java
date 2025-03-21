package StringMethod2;

public class lastIndexOf {
public static void main(String[] args) {
	
	String s1="Envirenments";
	String s2="Jadugarring";
	
	System.out.println(s1.lastIndexOf('e'));
	System.out.println(s1.indexOf('e'));
	System.out.println("****");
	
	System.out.println(s2.indexOf('a'));
	System.out.println(s2.lastIndexOf('a'));
	
	System.out.println(s1.indexOf('s'));
	System.out.println("length of String "+s1.length()); //12  -->Length starts from 1
	System.out.println("length of String "+s2.length()); //11  -->index starts from 1
}
}
