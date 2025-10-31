package Case1;

public class DeadLockCheck {

	public static void main(String[] args) throws InterruptedException {
		DeadLockThread1 thread1 = new DeadLockThread1();
		thread1.start();

		thread1.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

}
