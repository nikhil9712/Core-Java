package StringMethod2;

public class Indexof1 {
public static void main(String[] args) {
	
	String s="Envirenment";
	System.out.println(s.indexOf('v')); //2
	System.out.println(s.indexOf("ent")); //8
	System.out.println(s.indexOf('e'));  // 5
	System.out.println(s.indexOf('e',6)); //8
	
	String s1="";
	System.out.println(s.isEmpty());
	System.out.println(s1.isEmpty());
	System.out.println("*********");
	
//	System.out.println(s.isBlank());
//	System.out.println(s1.isBlank());
}
}
