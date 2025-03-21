package Array2;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[]a= {8,7,2,1,3,5,6,4};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i]>a[j]) {
					int swap=a[j];
					a[j]=a[i];
					a[i]=swap;	
				}
			}
			
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
