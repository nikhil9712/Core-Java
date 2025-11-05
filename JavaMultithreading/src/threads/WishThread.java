package threads;

import case3.Display;

public class WishThread implements Runnable {

	Display display;

	public static Object lock = new Object();

	public WishThread(Display display) {
		super();
		this.display = display;
	}

	@Override
	public void run() {
		synchronized (display) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + display.wish());
			}
			System.out.println("End");
		}
	}

}
