package Question10;

public class Fibonacchi {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		while (num1<=51) {
			if (num1==34) {
				System.out.println("is fibo");
				break;
			}
		//	System.out.println(num1);
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			
		}
	}
}
