package Array;

public class Sort1 {

	public static void main(String[] args) {
		
		int[]a= {10,25,48,76,2,4};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i]>a[j]) {
					int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
