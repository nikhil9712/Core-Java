package MethodChaining;

public class M1 {

	public M1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) 
	{
		M1 obj=new M1();
		obj.a();
		obj.b();
		obj.c();
		obj.d("Nikhil");
		System.out.println("********");
		obj.a().b().c().d("Sanket");
	}
	
	public M1 a()
	{
		System.out.println("My");
		return this;
	}
	public M1 b()
	{
		System.out.println("Name");
		return this;
	}
	public M1 c()
	{
		System.out.println("is");
		return this;
	}
	public M1 d(String name)
	{
		
		System.out.println(name);
		return this;
	}
}
