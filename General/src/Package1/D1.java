package Package1;

public class D1 {

	int num1;
	static int num2=200;
	
	public int num3;
	public static int num4=200;
	
	static void print()
	{
		System.out.println(" Default hello");
	}
	
	public static void print1()
	{
		System.out.println(" public  hello");
	}
	
	public D1() {
		System.out.println("Constuctor");
	}
	
	void Welcome1()
	{
		System.out.println(" Default Welcome !!");
	}
	
	public void Welcome2()
	{
		System.out.println(" Public Welcome !!");
	}
	
	protected static String name="Nikhil";
}
