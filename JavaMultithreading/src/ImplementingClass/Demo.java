package ImplementingClass;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo {

	public static BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(5);

	static class Producer implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				try {
					blockingQueue.put("Number" + i);
					System.out.println("Number Produced" + i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}

			}
		}

	}

	static class Consumer implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					String take = blockingQueue.take();
					System.out.println("Number Consumed" + take);
					Thread.sleep(1000);
					if (take.equals("Number Produced" + 5)) {
						break;
					}
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}

	}

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Producer());
		Thread thread2 = new Thread(new Consumer());
		thread1.start();
		thread2.start();
	}

}
