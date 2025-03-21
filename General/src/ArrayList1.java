import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(2);
		a.add(1);
		a.add(3);
		a.add(3);
		a.add(5);
		a.add(6);
		
		
		Collections.sort(a);
		System.out.println(a);
//		
//		Collections.swap(a, 0, 2);
		//System.out.println(a);
		
		Collections.rotate(a,1);
		System.out.println(a);
		
		
	}
}
