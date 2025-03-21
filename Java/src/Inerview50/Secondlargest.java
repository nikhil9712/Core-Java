package Inerview50;

public class Secondlargest {

	public static void main(String[] args) {
		
		int[]a= {25,14,22,5,44,44};
		int large1=a[0];
		int large2=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large1) {
				large2=large1;
				large1=a[i];
			}
			else if(a[i]>large2 && a[i]!=large1)
			{
				large2=a[i];
			}
				
		}
		System.out.println("First max: "+large1);
		System.out.println("Second max: "+large2);
		
	}
}
