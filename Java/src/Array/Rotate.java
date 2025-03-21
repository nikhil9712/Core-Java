package Array;

public class Rotate {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		rotete(a);
       
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		rotete(a);
	       
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		String s="Nikhil Prabhakarrao Gulhane";
		System.out.println(s);
		s.trim();
		System.out.println(s); 

	}

	public static void rotete(int[] a) {
		int swap = a[0]; //1
		for (int i = 1; i < a.length; i++) {
				a[i - 1] = a[i];
		}
		a[a.length - 1] = swap;
	}
	
	
}
