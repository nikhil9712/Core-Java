package Array;

public class SumOfEvenNumbers {

	
	public static void main(String[] args) {
		
		int[]a = {2,5,8,15,19,22,30};
		int evenSum=0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i]/2)*2==a[i]) {
				evenSum+=a[i];
				System.out.println(a[i]);
			}
		}
		System.out.println("sum of even numbers is: "+evenSum);
	}
}
