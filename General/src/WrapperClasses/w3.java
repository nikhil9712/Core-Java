package WrapperClasses;

public class w3 {

	public static void main(String[] args) {
		
		int number1=100;
		String s=String.valueOf(100);
		
		System.out.println(number1);
		System.out.println(s);
		
		int number2=Integer.parseInt(s);
		System.out.println(number2);
		
		System.out.println(number1>50);
		System.out.println(number2>50);
	//	System.out.println(s>50); undefined argument type String,int
		
		
		//Integer to String (Primitive to String)
		System.out.println(String.valueOf('M'));
		System.out.println(String.valueOf(100.256));
		System.out.println(String.valueOf(5000)+" Welcome"); //5000 Welcome
		System.out.println(String.valueOf(true)+"Hello"); //trueHello
		
		
		//String to integer (Non-primitive to primitive)
		System.out.println(Integer.parseInt("1546")); //1546
		System.out.println(Integer.parseInt("1546")+10000); //11546
		
		System.out.println(Double.parseDouble("548.124579"));   //548.124579
		System.out.println(Double.parseDouble("998.999")+1.001); //1000.0
		
		System.out.println(Boolean.parseBoolean("true"));      //true
		System.out.println(Boolean.parseBoolean("false"));     //false
		System.out.println(Boolean.parseBoolean("true") &&true);//true
		System.out.println(Boolean.parseBoolean("true") &&false);//false
		
		
		
		/*
		 * Integer i=new Integer(10)   -->primitive to non-primitive
		 * 
		 * int number=i.intvalue()     --non-primitive to primitive
		 * 
		 * String s=String.valueof(10); -->primitive to String
		 * 
		 * int number2=Integer.parseInt(s)-->String to primitive
		 */
		
		
	}
}
