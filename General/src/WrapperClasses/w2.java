package WrapperClasses;

public class w2 {

	public static void main(String[] args) {
		
		Integer i=10;  //Auto-Boxing
		System.out.println(i);
		
		int number1=i; //Auto-Unboxing
		
		System.out.println(number1);
		
		Double d=102.235; //Auto-Boxing
		System.out.println(d);
		
		double number2=d; //Auto-Unboxing
		System.out.println(number2);
		
		System.out.println(number1+number2); //112.235
		System.out.println(i+d);  //112.235
		
	}
}
