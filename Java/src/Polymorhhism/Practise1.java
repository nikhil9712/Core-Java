package Polymorhhism;

public class Practise1 {
   
	static int a=200;
	int b=100;
	
	public  void update()
	{
		a+=400;
		b+=500;
		
	}
	
	public static void main(String[] args) {
		Practise1 P1=new Practise1();
		P1.update();
	
		
		System.out.println(a);
		System.out.println(P1.b);
		System.out.println(P1.b+P1.b);
		System.out.println(P1.b+P1.b);
		System.out.println("===========");
		
		
		Practise1 P2=new Practise1();
		P2.update();
		System.out.println(a);
		System.out.println(P2.b);
	}
}
