package String;

public class S1 {

	public static void main(String[] args) {
		String s1=new String("Aniket");
		
		String s2=new String("Nikhil");
		
		String s3=new String("Aniket");
		
//		public String toString()   toString() method of String Class !! Which is inbuild in String class and overrides the object class 
		                                    //   toString() Method .
//		{ 
//			return "price+company+type";
//		}
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println("****************");
		
		System.out.println(s1.equals(s2)); 
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println("****************");
		
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		System.out.println(s1==s3);//false
		System.out.println("****************");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("****************");
		System.out.println(s1);
		
	}
}
