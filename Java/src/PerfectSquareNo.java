import java.util.Scanner;
public class PerfectSquareNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int count=0;
		for (int i = 1; i <=n; i++) {
			if (isPerfectNumber(i)) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	
	public static boolean isPerfectNumber(int num)
	{
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (j==i&&i*j==num) {
					return true;
				}
			}  
		}
		return false;
	}
}
