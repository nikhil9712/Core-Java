package ImplementingClass;

import case3.Display;
import threads.WishThread;

public class WishThreadImplementation {

	public static void main(String[] args) {

		Display display = new Display("Nikhil");
		Display display2 = new Display("Sarang");

		Thread thread1 = new Thread(new WishThread(display));
		Thread thread2 = new Thread(new WishThread(display2));

		thread1.start();
		thread2.start();
	}
}
