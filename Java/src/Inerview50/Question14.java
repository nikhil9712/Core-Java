package Inerview50;

public class Question14 {

	public static void main(String[] args) {
		
		int find=24;
		int[]a= {14,25,21,44,66,24,55};
		int start=0;
		int end=a.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if (find==a[mid]) {
				System.out.println("found at "+mid+" index !!");
				return;
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
		
			System.out.println("Number is not present in array !!");
		
	}
}
