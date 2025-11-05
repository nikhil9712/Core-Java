package ImplementingClass;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataInconsistencyProblem {

	int counter = 0;

	public final static Lock lock = new ReentrantLock();
	//Fair ordering (first come, first served)
	//Check if lock is held

	/*
	 * public synchronized void increment() { counter++; }
	 */

	/*
	 * public void increment() {
	 *  synchronized(this){
	 *   counter++; 
	 *   }
	 *  }
	 */

	public void increment() {
		lock.lock();
		try {
			counter++;
		} finally {
		lock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		DataInconsistencyProblem obj = new DataInconsistencyProblem();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				obj.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				obj.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join(); // main threads waiting to both the thread to complete execution
		t2.join();

		System.out.println("The Total Sum of Counter is " + obj.counter);

	}

}
