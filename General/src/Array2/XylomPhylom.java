package Array2;

public class XylomPhylom {

	public static void main(String[] args) {
		
		int[]a= {8,4,4,6,6,8};
		int sum1=a[0]+a[a.length-1];
		int sum2=0;
		for (int i = 1; i < a.length-1; i++) {
			sum2+=a[i];
		}
		
		if (sum1==sum2) {
			System.out.println("It is an Xylom array");
		} else {
            System.out.println("It is a phylom array ");
		}
		
	}
}
