package StringPractise;

public class Pattern {

	public static void main(String[] args) {
		
		int n=27;
		int space=0;  //0 //4
		int star=n;   //9  //1
		
		for (int i = 0; i <= n; i++) {       //0 //1 //2 //3 //4
			
			for (int j = 0; j < space; j++) {   
				System.out.print("  ");         		                                
				                             
			}
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
			if (i<n/2) {
				space++;
				star-=2;
			} else {
              space--;
              star+=2;
			}
		}
	}
}
