package Abstraction;

public class Abstraction2 extends Abstraction1{

	public void A()
			{
		       System.out.println("From method A !!");
			}
	
	public static void main(String[] args) {
		Abstraction1 A=new Abstraction2();
		A.A();
		
		 
	}
}
