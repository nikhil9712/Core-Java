package StringMethod2;

public class CodePointAt1 {

	public static void main(String[] args) {
		String num="Aikhil";
		int unicode=num.codePointAt(0);
		System.out.println(unicode);  //N->78
		System.out.println(num.codePointAt(1)); //i->105  A-->65
		System.out.println(num.codePointAt(2)); //k->107
		System.out.println(num.codePointAt(3));  //h->104
		System.out.println(num.codePointAt(4));  //i->105
		System.out.println(num.codePointAt(5));   //l->108
		
		System.out.println("*********");
		
//		int unicode2=num.codePointBefore(0);  --Error
//		System.out.println(unicode2);
		
		System.out.println(num.codePointBefore(5)); // i-->104
		System.out.println(num.codePointBefore(4)); // h-->105
		System.out.println(num.codePointBefore(3));  // k-->107
		System.out.println(num.codePointBefore(2));  // i-->105
		System.out.println(num.codePointBefore(1));  //N-->78
		
		System.out.println("*********");
		
		System.out.println(num.charAt(0));
		
		
		
		
	}
}
