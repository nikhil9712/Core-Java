package Array2;

public class DuplicateElemet {

	public static void main(String[] args) {
		
		int[]a= {14,2,2,2,55,66,14,88,14};
		int[]b=new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			int ct=0;
			for (int j = i; j < b.length; j++) {
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
