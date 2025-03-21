package Thread;

public class Pattern {

	public static void main(String[] args) {
		int n=15;
		int star=1;
		int space=n-1;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 0; j <space; j++) {
				System.out.print(" "+" ");
			}
			for (int j2 = 0; j2 <star; j2++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			star+=2;
			space--;
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		}
	}
}
