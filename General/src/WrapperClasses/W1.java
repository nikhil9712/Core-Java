package WrapperClasses;

public class W1 
{
   public static void main(String[] args) {
	
	   
	   Integer i = new Integer(500); // --> Primitive to non-Primitive
	   System.out.println(i.toString());
	   
	   
	   Double d=new Double(554.12546);  // --> Primitive to non-Primitive
	   System.out.println(d.toString());
	   
	   int number1=i.intValue();  
	   System.out.println(number1);   //-->Non-Primitive to Primitive
	  
	   double number2=d.doubleValue(); //-->Non-Primitive to Primitive
	   System.out.println(number1);
	   
	   System.out.println(number1+number2); //Number can not be added
	 //System.out.println(i+d);             object can not be added 
	  
	   
	   
	   
}

}