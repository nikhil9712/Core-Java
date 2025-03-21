
public class NullPointer {

	
	public void print()
	{
		System.out.println("hello !!");
	}
	public static void main(String[] args) {
		
		NullPointer n1=new NullPointer();
		NullPointer n2;
		
		n1.print();
		//n2.print(); Runtime Exception --NullPointer Exception
		
		int a;
		//System.out.println(a+10); Runtime Exception --NullPointer Exception
		
	}
}
