package Array;

public class Sort2 {

	public static void main(String[] args) {
		
		int[]a= {54,33,54,8,66,77};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
