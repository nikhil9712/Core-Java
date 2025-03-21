package Array;

public class CountOfEvenNumber {

	
	public static void main(String[] args) {
		
		int[]a = {2,5,4,6,87,49,88,12};
		int ct=0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i]/2)*2==a[i]) {
				ct++;
				System.out.println(a[i]);
			}
		}
		
		System.out.println("The count of even numbers is"+ct);
		System.out.println("the count of odd numbers is "+(a.length-ct));
	}
}
