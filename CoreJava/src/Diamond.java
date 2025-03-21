
public class Diamond {

	public static void main(String[] args) {
		
		int n=7;
		int star=1;
		int space=n/2; //3   0  1  2  3
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 0; j < space; j++) {   // star =1 3 5 7  5 3 1 
				System.out.print(" "+" ");    // space=3 2 1 0  1 2 3
			}
            for (int j = 0; j < star; j++) {  // i=7 space =1  star=1
				System.out.print("*"+" ");
			}
            if (i<=n/2) {
				star+=2;
				space--;
			}else if(i>n/2){
               star-=2;
               space++;
			}
            System.out.println();
		}
	}
}
