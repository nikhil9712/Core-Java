package LinkedList;

import java.util.LinkedList;

public class LL1 {

	
	public static void main(String[] args) {
		
		LinkedList<Integer> a=new LinkedList<>();
		
		a.add(15);
		a.add(90);
		a.add(101);
		a.add(80);
		a.add(48);
		a.add(46);
		
		System.out.println(a); //[15, 90, 101, 80, 48, 46]
		
		a.remove(1);
		System.out.println(a);  //[15, 101, 80, 48, 46]
		
		LinkedList<Integer> b=new LinkedList<>();
		b.add(15);
		b.add(1000);
		
		a.addAll(b);
		System.out.println(b); //[15, 1000]
		System.out.println(a); //[15, 101, 80, 48, 46, 15, 1000]
		
		a.removeAll(b);
		System.out.println(a); //[101, 80, 48, 46]
		
		System.out.println(a.size());
		System.out.println(b.size()); //size always starts with 0
		
		System.out.println(a.isEmpty()); //false
		System.out.println(b.isEmpty()); //false
		
		b.removeAll(b);
		System.out.println(b); //[]
		
		System.out.println(b.isEmpty()); //true
		
		System.out.println(a.contains(101));
		
		
		/*Extra method of Linked List
		 * other than collection and hashset
		 */
		System.out.println(a.getFirst()); //101
		System.out.println(a.getLast());  //46
		
		
		System.out.println(a.get(0));;  //101
		System.out.println(a.get(a.size()-1));//46
		
		System.out.println(a.element()); //also goves the first element 
		
		/*
		 * to get the first elemt we have three method in linked list
		 * a.get(0);
		 * a.getFirst();
		 * a.getElement();
		 */
		
		
		
		
		
	}
	
	
}
