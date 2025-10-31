package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsStart1 {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		

		for (int i = 1; i < 10; i++) {
			
			int finalI=i;
			executorService.submit(()->{
				try {
					System.out.println("The Factorial Of " + finalI + " is " + getFactorial(finalI));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}	
		executorService.shutdown();
		
		//System.out.println("Time Required " + (System.currentTimeMillis() - startTime));

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
