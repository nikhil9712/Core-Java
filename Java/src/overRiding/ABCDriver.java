package overRiding;

public class ABCDriver {

	
	 public static void main(String[] args) {
		A a1=new B();
		
		//a1.useful();
		//a1.useless();
		
		A a2=new C();
		//a2.useful();
		a2.useless();
		System.out.println("++++++++++++++");
		B b1=new C();
		b1.useless();
		
		
	}
}
