package threads;

public class OddEventhreadClass1 implements Runnable {

	public static int startnumber = 1;
	public final int endNumber = 20;
	public static final Object lock = new Object();

	@Override
	public void run() {
		while (true) {
			synchronized (lock) {
				if (startnumber > endNumber) {
					break;
				}
 				if ((Thread.currentThread().getName().equalsIgnoreCase("Thread1") && startnumber % 2 != 0)
						|| (Thread.currentThread().getName().equalsIgnoreCase("Thread2") && startnumber % 2 == 0)) {
					System.out.println(Thread.currentThread().getName() + " " + startnumber);
					startnumber++;
					lock.notify();
				}			
			}
		}
	}

}
