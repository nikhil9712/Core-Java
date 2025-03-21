package Abstraction;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[]a= {9,55,9,77,4,6,84,77};
		int ct=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
				ct++;
				a[j]=-1;
			 }	
			}
		}
		
		int[]ans=new int[a.length-ct];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=-1) {
				ans[index]=a[i];
				index++;
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
