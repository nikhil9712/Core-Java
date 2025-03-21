package Array;

public class SmallestElement {

	public static void main(String[] args) {
		
		int[]a= {11,2,3,4,5};
		
		int large=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large) {
				large=a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<large) {
				
				large=a[i];
			}
		}
		
		int small=large;
		System.out.println(large);
	}
}
