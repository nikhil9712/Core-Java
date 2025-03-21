
public class P {

	static int i;
	int j;
	
	static
	{
		System.out.println("Static here !!");
		//i=10;
	}
	{
		i=10;
		j=20;
		System.out.println("Non static ");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println(i);
	//	System.out.println(j); compile time errro because non static member is not still called by constructor !!
	    
	   P p1=new P();
	  
	  System.out.println(i);
	  System.out.println(p1.j);
	  
	}
}
