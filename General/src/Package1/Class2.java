package Package1;

public class Class2 extends Class1{

	public static void main(String[] args) {
		
	//	System.out.println(Class1.a); -->Private member

		System.out.println(Class1.b);
		
	//	Class1.print1(); //-->Private member

		Class1.print2(); 
		 
	   
		Class1 b=new Class2();
		b.print2();
		System.out.println(b.num);
	
	}
}
