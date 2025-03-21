package Array;

public class EvenNumbers {

	
	public static void main(String[] args) {
		
		int[]a = {2,5,4,6,87,49,88,12};
		
		for (int i = 0; i < a.length; i++) {
			if ((a[i]/2)*2==a[i]) {
				System.out.println(a[i]);
			}
		}
	}
}
