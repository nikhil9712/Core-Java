package StringPractise;

public class IndexOfmax {

	public static void main(String[] args) {
		
		int[]a= {10,20,30,100,10,25,36,4};
		
		int max=a[0];
		int x=0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] +" *"+a[0]);
			if (a[i]>max) {
				max=a[i];
				x=i;
				System.out.println(max);
				System.out.println(i);
			}
			
		}
		System.out.println(x);
	}
}
