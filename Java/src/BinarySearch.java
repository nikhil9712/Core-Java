
public class BinarySearch {

	public static void main(String[] args) {
		
		
		int[]a= {11,564,33,48,69,468,4587,66};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[i]) {
					int swap;
					swap=a[j];
					a[j]=a[i];
					a[i]=swap;
				}
			}
			
		}
		int search=564;
		int start=0;
		int mid=a.length/2;
		int end=a.length;
		
		for (int i = start; i <end; i++) {
			
			if (search==a[mid]) {
				System.out.println("mid found");
				break;
			}
			else if(search>a[mid])
			{
				start=mid+1;
				
			}
			else if(search<a[mid])
			{
				end=mid-1;
			}
		
		}
		
	}
}
