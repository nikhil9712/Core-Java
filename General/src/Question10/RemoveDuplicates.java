package Question10;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,1,2,3};
		int[]b=new int[a.length];
		
		for (int i = 0; i < a.length; i++) 
		{
			int ct=1;
			for (int j = i+1; j < b.length; j++) 
			{
				if(a[i]==a[j])
				{
				ct++;
				a[j]=-1;
				}
			}
			b[i]=ct;
			ct=1;
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]+" "+b[i]);
		}
		
		int size=0;
		for (int i = 0; i < b.length; i++) {
			if (a[i]!=-1) {
				size++;
			}
		}
		System.out.println(size);
		
		int[]ans=new int[size];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=-1) {
				ans[index]=a[i];
				index++;
			} 
		}
      
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		
		
	}
}
