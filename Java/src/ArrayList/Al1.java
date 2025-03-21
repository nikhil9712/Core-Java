package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Al1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList Book =new ArrayList<>();
		
		Book.add("RAMAYAN");
		Book.add("MAHABHARAT");
		Book.add("SECRET STORY");
		Book.add("TRADING HUB");
		Book.add("TIMES");
	    
		
		System.out.println("Enter book name: ");
		String ip=sc.nextLine();
		
		int i;
		for (i = 0; i < Book.size(); i++) {
			
			
			if (Book.contains(ip)) {
				System.out.println("Book found");
				break;
			}
		}
		if (i==Book.size()-1) 
		{
			System.out.println("Book not available");
		}
		
	}
}
