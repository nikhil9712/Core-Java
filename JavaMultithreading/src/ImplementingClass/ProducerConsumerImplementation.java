package ImplementingClass;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerImplementation {

	public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

	static class ProducerThread implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				try {
					queue.put("Number " + i);
					System.out.println("Produced "+i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}

	static class ConsumerThread implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(10000);
					String take = queue.take();
					System.out.println("Number Consumed " + take);
					if (take.equals("Number " + 5)) {
						break;
					}
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}

			}
		}
	}

	public static void main(String[] args) {

		Thread thread1 = new Thread(new ProducerThread(), "producer");
		thread1.start();
		Thread thread2 = new Thread(new ConsumerThread(), "Consumer");
		thread2.start();
	}
}
