package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerThread implements Runnable {

	public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
	public static final Object lock = new Object();
	public static int startNumber = 1;

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				queue.put("Number "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
