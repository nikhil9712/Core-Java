package Array2;

public class SecondMax {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8,9};
		int max1=Integer.MIN_VALUE;
		int max2=max1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max1) {
				max2=max1;
				max1=a[i];
				
			} 
			
		}
		System.out.println("First max is: "+max1);
		System.out.println("Second max is: "+max2);
	}
}
