package Array;

public class DuplicateAndUnique {

	public static void main(String[] args) {

		int[] a = { 1, 2,4,1,5,1,1,1,1,1,1,1,2};

		for (int i = 0; i < a.length; i++) {
			int ct=0;
			for (int j = i; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					ct++;
				}
			}
			if (ct==2) {
				System.out.println(a[i]);
			}
		}

	}
}
