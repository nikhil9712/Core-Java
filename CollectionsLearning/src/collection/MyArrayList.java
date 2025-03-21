package collection;

import java.util.LinkedList;

public class MyArrayList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		// Example of adding elements
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		// Example of printing elements
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}
}
