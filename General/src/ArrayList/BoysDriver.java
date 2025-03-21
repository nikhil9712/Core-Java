package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BoysDriver {

	public static void main(String[] args) {
		
		ArrayList<Boys> a=new ArrayList<>();
		
		Boys b1=new Boys("Akash", 22);
		Boys b2=new Boys("Ramesh", 56);
		Boys b3=new Boys("Nikhil", 23);
		Boys b4=new Boys("Mangesh", 47);
		
		a.add(b4);
		a.add(b3);
		a.add(b2);
		a.add(b1);
		
		Collections.sort(a);
		System.out.println(a);
	}
}
