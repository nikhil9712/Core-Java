package Basic;

public class StaticOrder {

	
	static
	{
		System.out.println("From static block ");
	}
	{
		System.out.println("From non-static block");
	}
	
	public StaticOrder() {
		System.out.println("From constructor");
	}
	
	public static void main(String[] args) {
		
	
		new StaticOrder();
		System.out.println("Hello");
	}
}
