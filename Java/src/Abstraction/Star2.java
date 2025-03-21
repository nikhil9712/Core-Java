package Abstraction;

public class Star2 {

	public static void main(String[] args) {

		int n = 25;
		int space = n / 2;
		int star = 1;

		for (int i = 1; i <=n; i++) {

			for (int j = 0; j < space; j++) {  
             System.out.print(". ");
			}
			for (int j = 0; j < star; j++) {
				 System.out.print("* ");
			}
			System.out.println();
			if (i <= n / 2) {
				space--;
				star += 2;
			} else if (i > n / 2) {
				space++;
				star -= 2;
			}
		}

	}
}
