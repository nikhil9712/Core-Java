package Hashset;
import java.util.ArrayList;
import java.util.HashSet;
public class H1 {
	
public static void main(String[] args) {
	
	ArrayList<Integer> a1=new ArrayList<>();
	
	a1.add(50);
	a1.add(12);
	a1.add(9);
	a1.add(88);
	a1.add(23);
	a1.add(33);
	a1.add(88);
	
	System.out.println(a1);
	
	HashSet<Integer> h1=new HashSet<>(a1);
	System.out.println(h1);
	
	/*Here hashset is removing the duplicate elements by comparing the elements
	 * with the help of equals() method which is from the object class and overrided to
	 * the wrapper class i.e.Integer class and if return true it removes and if false it does
	 * not remove the element
	 */
}
}
