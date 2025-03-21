package Array;

public class LinearSorting {

	public static void main(String[] args) {
		
		int[]a= {10,25,45,68,2,15,101};
		
		for (int i = 0; i < a.length-1; i++) {
			int swap;
			
			for (int j = i; j < a.length; j++) {
				if (a[i]<a[j]) {
					swap=a[i]; //68
					a[i]=a[j]; //2
					a[j]=swap; //68
				}
			}
			
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}
