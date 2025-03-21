import java.util.ArrayList;
import java.util.Iterator;

public class Throws {

	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		System.out.println("Thred Started"); 
		// thread.start();--java.lang.IllegalThreadStateException
		
		
		
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("Nikhil");
		arrayList.add("Sanket");
		arrayList.add("Jayesh");
		
		Iterator<String> iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			//Object next = iterator.next();
			iterator.remove(); // java.lang.IllegalStateException
		}
		System.out.println(arrayList);
	}
}
