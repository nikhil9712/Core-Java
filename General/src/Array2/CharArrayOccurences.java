package Array2;

public class CharArrayOccurences {

	public static void main(String[] args) {

		char[] a = { 'a', 'b', 'c','z','d', 'e', 'k', 's', 'h', 't' };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					char swap = a[j];
					a[j] = a[i];
					a[i] = swap;
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
