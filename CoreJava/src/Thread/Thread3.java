package Thread;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("My Thread " + i);
			try {
				Thread.sleep(1500);
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		Thread3 thread3 = new Thread3();
		Thread thread = new Thread(thread3);
		thread.start();
	}

}
