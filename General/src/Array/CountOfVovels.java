package Array;

public class CountOfVovels {

	public static void main(String[] args) {
		
		char[]a= {'a','b','c','d','e','f','g','h','i','j'};
		int ct=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]=='A' ||a[i]=='E' ||a[i]=='I' ||a[i]=='O' ||a[i]=='U' ||
					a[i]=='a' ||a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' ) {
				ct++;
			}
		}
		
		System.out.println("The count of vovels are: "+ct );
		
	}
}
