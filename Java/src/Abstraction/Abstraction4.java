package Abstraction;

public class Abstraction4  implements Abstraction3 {

	
	public void A()
	{
		System.out.println("From class body provided !!");
	}
	
	public static void main(String[] args) {
		Abstraction3 A1=new Abstraction4();
		
		A1.A();
		Abstraction3.B();
	    
		
		System.out.println(Abstraction3.a);
		System.out.println(Abstraction4.a);
	}
}
