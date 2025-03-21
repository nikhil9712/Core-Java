package Vector;

import java.util.Vector;

public class V1 {

	public static void main(String[] args) {
		
		Vector<Integer> v1=new Vector<>();
	
		v1.add(10);
		v1.add(30);
		v1.add(20);
		v1.add(40);
		v1.add(38);
		v1.add(24);
		System.out.println(v1); //[10, 30, 20, 40, 38, 24]
		
		Vector<Integer> v2=new Vector<>();
		
		v2.add(84);
		v2.add(445);
		v2.add(889);
		System.out.println(v2); //[84, 445, 889]
		
		v1.addAll(v2);
		System.out.println(v1); //[10, 30, 20, 40, 38, 24, 84, 445, 889]

		v1.remove(v1.size()-1); //889
		System.out.println(v1); //[10, 30, 20, 40, 38, 24, 84, 445]
		
		v1.removeAll(v2);
		System.out.println(v1); //[10, 30, 20, 40, 38, 24]
		
		System.out.println(v1.size());
		System.out.println(v2.size());

		System.out.println(v1.isEmpty()); //false
        System.out.println(v2.isEmpty());	//false
        
        v2.removeAll(v2);
        System.out.println(v2.isEmpty()); //true
        
        System.out.println(v1); //[10, 30, 20, 40, 38, 24]
        
       /*
        * Extra method of Vector class
        */
		
         System.out.println(v1.get(0)); //to get the fisrt element of the list
         System.out.println(v1.get(v1.size()-1)); //to get the last element of the list
         
        
	}
}
