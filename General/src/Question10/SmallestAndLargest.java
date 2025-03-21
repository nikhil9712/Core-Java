package Question10;

public class SmallestAndLargest {

	public static void main(String[] args) {
		
		int[]a= {24,55,66,888,79,63,6,35,32};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int swap=a[j];
					a[j]=a[i];
					a[i]=swap;
				}
			}
		}
		System.out.println("The smallest element of array is : "+a[0]);
		System.out.println("The Largest element of array is : "+a[a.length-1]);
	}
}
