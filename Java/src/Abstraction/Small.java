package Abstraction;

public class Small {

	public static void main(String[] args) {
		
		int[]a= {55,44,88,6,2,11,4};
		int small=a[0];
		int large=a[0];
		
		for (int i = 1; i <a.length; i++) {
			if (a[i]<small) {
				small=a[i];
			}
			if (a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("small: "+small+" large: "+large);
	}
}
