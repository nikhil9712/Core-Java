package Array2;

public class BubbleSort {

	public static void main(String[] args) {
	
		
		
		
		int []a= {12,55,99,101,523};
		
		int start=0;
		int end=a.length-1;
		 //a particular value has been gone by formula
		int find=523;
		
		while (start<=end) {
			int mid=(start+end)/2;
			if (find==a[mid]) {
				System.out.println("Element found at "+mid+"Index");
				break;
			}
			else if(find>a[mid])
			{
				start=mid+1;
			}
			else if(find<a[mid])
			{
				end=mid-1;
			}
		}
	
	if(start>end)
	{
       System.out.println("Element not found !!");
    }
	
	}
}
	
