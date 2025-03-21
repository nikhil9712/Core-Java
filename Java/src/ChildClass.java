
public class ChildClass extends SuperClass{

	public  void message()
	{
		System.out.println("Overriden and abstraction achieved ");
	}
	public void print()
	{
		System.out.println("Child class");
	}
	 
	public static void main(String[] args) {

//		SuperClass s1=new SuperClass(102100l,6451);
//		System.out.println(s1.getAccno());
//		s1.setAccno(16455565l);
//		System.out.println(s1.getAccno());
		
		SuperClass s2=new ChildClass();
		s2.print();
		s2.message();
		
	}
	
}
