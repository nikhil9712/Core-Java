package Array2;

public class occurences {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 8, 9, 1, 2 };
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) { //i=0,1,2,3,4,5,6,7,8,9,10,11,12
			int ct = 0;
			for (int j = i+1; j < a.length; j++) { //j=1,2,3,4,5,6,7,8,9,10,11,12
				if (a[i] == a[j]) {
					ct++;
					a[j] = -1;
				}
			}
			if (a[i] != -1) {
				b[i] = ct;
			}
			ct = 0;

		}
		for (int i = 0; i < b.length; i++) {

			if (a[i]!=-1) {
				System.out.println("The count of " + a[i] + " is " + b[i]);
			}

		}

	}
}
