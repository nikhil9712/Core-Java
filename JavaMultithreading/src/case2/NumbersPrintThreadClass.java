package case2;

public class NumbersPrintThreadClass implements Runnable {

	static int startNumber = 1;
	static final int endNumber = 100;

	public static final Object lock = new Object();

	@Override
	public void run() {
		while (true) {
			
			synchronized (lock) {
				if (startNumber>endNumber) {
					break;
				}
				System.out.println(Thread.currentThread() + "" + startNumber);
				startNumber++;
			}
			Thread.yield();
		}
	}

	
	/*
	@Override
	public void run() {
		while (true) {
			synchronized (lock) {
				if (startNumber > endNumber) {
					break;
				}
				System.out.println(Thread.currentThread() + "" + startNumber);
				startNumber++;
			}
			Thread.yield();
		}
	}
	*/
	
	/*
	@Override
	public void run() {
		synchronized (lock) {
		while (startNumber <= endNumber) {
				System.out.println(Thread.currentThread() + "" + startNumber);
				startNumber++;
			}
		Thread.yield();
		}
	}
	 A thread acquires the lock.

    It enters the loop and prints all numbers from startNumber to endNumber without releasing the lock.
  
    Other threads are blocked the entire time.

    Thread.yield() is called after the loop finishes — which is too late.
	*/

}
