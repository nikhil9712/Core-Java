package threads;

public class NotifyThreadExample {
	static int total = 0;
	public static Object lock=new Object();

	static class Thread1 implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <= 200; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
				total += i;
				System.out.println("Curret total is "+total);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			synchronized (lock) {
				lock.notify();
			}
			for (int j = 0; j <=10; j++) {
				System.out.println("Still Execution is going on");
			}
			System.out.println("Execution Ended for this thread");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Thread1());
		thread1.start();
		synchronized (lock) {
			lock.wait();			
			System.out.println(Thread.currentThread().getName()+" "+total);
		}
	}

}
