package executors;

import java.util.ArrayList;
import java.util.List;

public class ExecutorsTutorials {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		List<Thread> threads = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			int finalI=i;
			Thread t1=new Thread(()->{
				try {
					System.out.println("The Factorial Of " + finalI + " is " + getFactorial(finalI));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			threads.add(t1);
		}	
		
		for (Thread thread : threads) {
			thread.start();
			thread.join();
		}
		System.out.println("Time Required " + (System.currentTimeMillis() - startTime));

	}

	public static int getFactorial(int number) throws InterruptedException {
		Thread.sleep(1000);
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
