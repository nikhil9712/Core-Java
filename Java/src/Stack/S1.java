package Stack;

import java.util.Stack;

public class S1 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Stack<Integer> s1=new Stack<>();
		s1.add(10);
		s1.add(30);
		s1.add(15);
		s1.add(16);
		s1.add(18);
		
		System.out.println(s1); 
		/*
		 * [10, 30, 15, 16, 18]
		 * Prints the set 
		 */
		
		System.out.println(s1.peek());
		//prints the last added bcz its a stack
		
		System.out.println(s1.pop());
		/*
		 * retrives and removes latest 
		 * 18
		 */
		System.out.println(s1); //[10, 30, 15, 16]
		
		
	}
}
