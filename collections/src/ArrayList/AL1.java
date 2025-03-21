package ArrayList;
import java.util.ArrayList;
public class AL1 {

	public static void main(String[] args) {
		/*
		 * add()
		 * addAll()
		 * isEmpty()
		 * size()
		 * contains()
		 * containsAll()
		 */
		ArrayList <Integer> a1=new ArrayList<>();
	/*
	 * Using Add method
	 */
		a1.add(1);
		a1.add(548);
		a1.add(794);
		a1.add(243);
		a1.add(5000);
		System.out.println(a1);
		System.out.println();
		
		/*
		 * using Get method
		 */
		System.out.println("getting elements by index: ");
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a1.get(4));
		System.out.println("***********");
		
		ArrayList <Integer> a2=new ArrayList<>();
		System.out.println("Sub Arraylist: ");
		a2.add(700);
		a2.add(800);
		a2.add(500);
		System.out.println("***********");
		
		/*
		 * using addAll() Method
		 */
		System.out.println("using addAll()");
		a1.addAll(a2);
		System.out.println(a1);
		
		System.out.println();
		
		/*
		 * getAll operation can be done by printing the object reference only because 4
		 * ArrayList class overrides the toString method
		 */
		/*
		 * contains() method to check a particular object inside the collection
		 */
		System.out.println(a1.contains(5000));
		System.out.println(a1.contains(121));
		System.out.println("***********");
		System.out.println(a1.containsAll(a2));
		System.out.println(a2.containsAll(a1));
		System.out.println("***********");
		
		//to check the collections is empty or not
		System.out.println(a1.isEmpty());
		System.out.println(a2.isEmpty());
		System.out.println("***********");
		
		//to check the number of elements
		System.out.println(a1.size());
		System.out.println(a2.size());
		System.out.println("***********");
		
		//to remove a particular elemet
		System.out.println(a1.remove(0));
		System.out.println(a1); //1 value is removed [548, 794, 243, 5000, 700, 800, 500]

		//to remove the collection
		System.out.println(a1.removeAll(a2));
		System.out.println(a1); //[548, 794, 243, 5000]
		
		ArrayList<String> a3=new ArrayList<>();
		a3.add("Nikhil");
		a3.add("Sanket");
		a3.add("Pratik");
		a3.add("Kiran");
		a3.add("Nimish");
		a3.add("Prajwal");
		String s="ajay";
		a3.add(s);
		System.out.println(a3);
		System.out.println("***********");
		
		System.out.println(a3.size()); //counting starts with 1 and indexing starts with 0
		
		System.out.println(a1); //[548, 794, 243, 5000]
		
		System.out.println(a1.get(0)); //to get the first element in ArrayList
		
		System.out.println(a3.get(a3.size()-1));//to get the last element in ArrayList
		
	
		
	}
	
}
