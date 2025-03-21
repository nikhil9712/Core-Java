package Pack1;

public class Pattern6 {

	public static void main(String[] args) {
		
		int n=9;
		int space=n/2;
		int star=1;
		
		for (int i = 1; i <=n; i++) {  //n=8 
			for (int j = 0; j <space; j++) { //0 0 0 0 *
				                             //0 0 0 * * *
				                            // 0 0 * * * * *
				                            // 0 * * * * * * *
				                            // * * * * * * * * *
				                            // 0 * * * * * * *
				                            // 0 0 * * * * *
				                            // 0 0 0 * * *
				                           //  0 0 0 0 *
				
				System.out.print("0"+" ");
			}
			for (int j = 0; j <star; j++) {
				System.out.print("*"+" ");
			}
			if (i<=n/2) {
				space--;;
				star+=2;
			}
			if(i>n/2)
			{
              space++;
              star-=2;
			}
			System.out.println();
			
			
		}
	}
}
