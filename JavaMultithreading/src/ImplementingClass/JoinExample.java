package ImplementingClass;

public class JoinExample {
	static int total = 0;

	static class Thread1 implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <= 2000000000; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
				total += i;
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Thread1());
		thread1.start();
		thread1.join(); // Main thread Wait until Completion of Thread1
		System.out.println(total);
	}

}
