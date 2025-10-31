package threads;

public class DeadLockConditionThreadClass implements Runnable {

	static int startNumber = 1;
	public static final Object lock = new Object();

	@Override
	public void run() {

		while (true) {
			synchronized (lock) {
				if (startNumber>20) {
					lock.notifyAll();
					break;
				}
				if (Thread.currentThread().getName().equalsIgnoreCase("Thread1")) {
					if (startNumber%2!=0) {
						System.out.println(Thread.currentThread().getName()+" "+startNumber);
						startNumber++;
						lock.notify();
					}else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
				}
				if (Thread.currentThread().getName().equalsIgnoreCase("Thread2")) {
					if (startNumber%2==0) {
						System.out.println(Thread.currentThread().getName()+" "+startNumber);
						startNumber++;
						lock.notify();
					}else {
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

}
