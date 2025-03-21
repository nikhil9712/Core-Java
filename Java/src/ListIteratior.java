import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratior {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add("Ajay");
		a.add("Nimish");
		a.add("Mangesh");
		a.add("Suresh");
		
		ListIterator i=a.listIterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			//i.add("Nikhil");
		}
		System.out.println();
		
		while (i.hasPrevious()) {
			System.out.println(i.previous());
			
		}
				
				
	}
}
