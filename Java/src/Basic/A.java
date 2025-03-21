package Basic;

public class A {

	static
	{
		
		System.out.println("From static");
		new A();
	}
	{
		System.out.println("From non-static");
	}
	public A() {
		System.out.println("From constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main method !!");
	}
}
