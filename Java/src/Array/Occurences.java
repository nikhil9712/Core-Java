package Array;

public class Occurences {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,2,6,6,3,6,7,1,1,1,1};
		int[]b=new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			int count=1;
			if (a[i]!=-1) {
				for (int j = i+1; j < b.length; j++) {
					if (a[i]==a[j]) {
						count++;
					}
				}
				b[i]=count;
				count=1;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]+": "+b[i]);
		}
	}
}
