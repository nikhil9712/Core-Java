package Array2;

public class largestNumber {

	public static void main(String[] args) {
		
		int[]a= {2,11,3,44,55,43,60};
		
		int large=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large) {
				large=a[i];
			}
		}
		
		int small=large;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<small) {
				small=a[i];
			}
		}
		
		System.out.println("The large value is: "+large);
		System.out.println("The small value is: "+small);
		
	}
}
