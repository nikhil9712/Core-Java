package Case1;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println("Child thread");
			Thread.yield();
		}
	}
	
	public void run(int j) {
		for (int i = 0; i <= 50; i++) {
			System.out.println("Another Run Child thread Mathod");
		}
	}
}
