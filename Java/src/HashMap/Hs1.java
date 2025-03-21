package HashMap;
import java.util.HashMap;
public class Hs1 {

	public static void main(String[] args) {
		
		
        HashMap<Integer,String> h2=new HashMap<>();
		
		h2.put(1, "Jadugar");
		
		HashMap<Integer,String> h1=new HashMap<>();
		
		h1.put(1, "Sanket");
		h1.put(2, "Ajay");
		h1.put(3, "Pratik");
		h1.put(4, "Sagar");
		h1.put(5, "Amit");
		
		System.out.println(h1); //{1=Sanket, 2=Ajay, 3=Pratik, 4=Sagar, 5=Amit}
		
		System.out.println(h1.entrySet());
		//{1=Sanket, 2=Ajay, 3=Pratik, 4=Sagar, 5=Amit} Set view
		
		System.out.println(h1.get(4)); 
		//sanket give the value at the particular index 
		
		System.out.println(h1.getOrDefault(9,"Not found"));
		//find the index if present return the value of that index else display String
		
		System.out.println(h1.hashCode());
		
		System.out.println(h1.isEmpty());
		//checks weather the map is empty or not 
		
		System.out.println(h1.size());
		// give the number of element present in the map
		
		System.out.println(h1.containsKey(1));
		// check weather the particular key is presnt in the map or not
	
		System.out.println(h1.containsValue("Amit"));
		//check weather the particular value is present in the map or not
		
		h1.put(6,"Kiran");
		System.out.println(h1);
		//add the value for the particular key !1
		
		/*
		h1.clear();
		System.out.println(h1);
		removes the all the element of the map
		*/
		
		System.out.println(h1.values());
		//print the values of the map
		
		System.out.println(h1.keySet());
		//print the keys of the particular set
		
		System.out.println(h1.keySet());
		
		System.out.println("End");
		
		
		
		
		
		
		
		
	}
}
