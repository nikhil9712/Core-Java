import java.util.ArrayList;
import java.util.Scanner;

import ArrayList.Al1;
public class Books {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select book: ");
		String book=sc.nextLine();
		
		ArrayList b=new ArrayList();
		
		b.add("A");
		b.add("B");
		b.add("C");
		b.add("D");
		
		System.out.println(contains(b, book));
		
		for (Object o : b) {
			if (b.contains(o)) {
				System.out.println("You can borrow book");
				b.remove(book);
				System.out.println(b);
				return;
			}
			
			
		
	  }
	}
	
	public static boolean contains(ArrayList l1,String ip)
	{
		for (int i = 0; i < l1.size(); i++) {
			String s=(String)l1.get(i);
		    if (ip.equalsIgnoreCase(s)) {
				return true;
			}
		}
		return false;
	}
}
