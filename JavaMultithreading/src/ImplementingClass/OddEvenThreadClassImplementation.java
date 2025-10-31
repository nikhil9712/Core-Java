package ImplementingClass;

import threads.OddEvenThreadClass;

public class OddEvenThreadClassImplementation {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new OddEvenThreadClass(),"Odd");
		thread1.start();
		Thread thread2 = new Thread(new OddEvenThreadClass(),"Even");
		thread2.start();
	}
}
