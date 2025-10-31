package ImplementingClass;

import threads.OddEventhreadClass1;

public class OddEventhreadClassImplementation1 {

	public static void main(String[] args) {

		OddEventhreadClass1 oddEventhreadClass1 = new OddEventhreadClass1();
		OddEventhreadClass1 oddEventhreadClass2 = new OddEventhreadClass1();
		Thread thread1 = new Thread(oddEventhreadClass1,"Thread1");
		Thread thread2 = new Thread(oddEventhreadClass2,"Thread2");

		thread1.start();
		thread2.start();

	}
}
