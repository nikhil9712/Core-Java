package Pack1;

public class Pattern5 {

	public static void main(String[] args) {
		
		int n=7;
		int star=1;
		int space=n-1;
		
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <space; j++) {
				System.out.print(" "+" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			star+=2;
			space--;
		}
	}
}
