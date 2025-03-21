package Array2;

public class Sorting {

	public static void main(String[] args) {
		
		int[]a= {10,54,8,555,44,88,62};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int swap=a[j];
					a[j]=a[i];
					a[i]=swap;
				} 
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
}
