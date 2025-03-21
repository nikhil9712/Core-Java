
public class Wrapper {

	public static void main(String[] args) {
	
		int a=5;
		int c=15;
		
		Integer i=new Integer(a);  //---> Boxing Primitive to Non-Primitive
		
		System.out.println(i.toString());
		
		Double b=new Double(3.14);  //--> //---> Boxing Primitive to Non-Primitive
		
		System.out.println(b);
		System.out.println(b+c);
		
		
	}
}
