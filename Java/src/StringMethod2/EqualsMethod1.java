package StringMethod2;

public class EqualsMethod1 {

	public static void main(String[] args) {
		 String name="structure";
		 String name1="STRUCTURE";
		 String name2="structure";
		 
		 System.out.println(name.equals(name2)); //true
		 System.out.println(name.equals(name1)); //false
		 System.out.println("pen".equals("pen")); //true
		 System.out.println("********");
		 
		 System.out.println(name.equalsIgnoreCase(name2)); //true
		 System.out.println(name.equalsIgnoreCase(name1)); //true
		 System.out.println("NIKHIL".equalsIgnoreCase("nikhil")); //true
	}
}
