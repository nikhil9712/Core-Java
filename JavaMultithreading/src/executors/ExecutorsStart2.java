package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsStart2 {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		for (int i = 1; i < 10; i++) {

			int finalI = i;
			executorService.submit(() -> {
				try {
					System.out.println("The Factorial Of " + finalI + " is " + getFactorial(finalI));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
		executorService.shutdown();

		// System.out.println("Time Required " + (System.currentTimeMillis() -
		// startTime));

	}

	public static int getFactorial(int number) throws InterruptedException {
		Thread.sleep(1000);
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
	
   // Runnable Vs callable
	/*
	 * Both are quite  similar other than following differences
	 * 
	 * Runnable has one method as run which does not return anything
	 * Callable has one method as call which return v as generic
	 * 
	 * 
	 * in ExecutorService submit method is overloaded which takes to difference type of paarmeters
	 * 1> runnable 
	 * 2> Callable
	 * 
	 * in ExecutorService submit method if which takes Runnable or Callable then the return type is Future<?>
	 * for it
	 * 
	 * but for Runnable it does not return anything but for 
	 * Callable it returns some value
	 * 
	 * 
	 * when we have to return something then we should go for Runnable 
	 * When we do not have to return anuthing then we shuld go for callble
	 */
}
