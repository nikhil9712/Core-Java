import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num=sc.nextInt();
			
			System.out.println("Enter a denomiter: ");
			int den=sc.nextInt();
			
			int res=num/den;
			System.out.println(num);
		}
		finally
		{
			System.out.println("Thank you !!");
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Cant divide number by 0");
		}*/
	}
}
