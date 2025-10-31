package threads;

public class OddEvenThreadClass implements Runnable {

	static int i = 1;
	public static final Object lock = new Object();

	@Override
	public void run() {
		while (i < 100) {
			synchronized (lock) {

				if (i >= 100) {
					lock.notifyAll();
					break;
				}

				if ((Thread.currentThread().getName().equals("Odd") && i % 2 != 0)
						|| (Thread.currentThread().getName().equals("Even") && i % 2 == 0)) {
					System.out.println(Thread.currentThread() + "" + i);
					i++;
					lock.notifyAll();
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}

			}
		}
	}
}
