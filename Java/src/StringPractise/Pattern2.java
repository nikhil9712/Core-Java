package StringPractise;

public class Pattern2 {

	public static void main(String[] args) {
		
		int row=9;
		
		for (int i = 0; i < row/2; i++) {
			for (int j = 0; j <i; j++)
			{
				System.out.print("0 ");
			}
			for (int k = 0; k <row-2*i; k++) 
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}
