package Array2;

public class UniqueElement {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,5,6,7,1,2,3,};
		
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			if (count==1) {
				if (a[i]!=0) {
					System.out.println(a[i]);
				}
			}
			count=0;
		}
	}
}
