package Array2;

public class NeonNumber {

	public static void main(String[] args) {
		
		int[]a= {9,3,44,11,66,75,84};
		
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			while (a[i]!=0) {
				int rem=a[i]%10;
				sum+=rem;
				a[i]/=10;
			}
			int square=sum*sum;
			int sum2=0;
			while (square!=0) {
				int rem=square%10;
				sum2+=rem;
				square/=10;
			} 
			if (sum==sum2) {
				System.out.println("It is a Neon Number");
			} else {
				System.out.println("It is not a Neon Number");
			}
			System.out.println(sum+" "+square+" "+sum2);
			break;
		}
	}
}
