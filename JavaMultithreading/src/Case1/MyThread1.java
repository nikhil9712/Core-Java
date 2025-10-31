package Case1;

public class MyThread1 extends Thread {

	public static Thread mt;

	@Override
	public void run() {

		try {
			MyThread1.mt = Thread.currentThread();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Thread.yield();
		}
	}

	public void run(int j) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Another Run Child thread Mathod");
		}
	}
}
