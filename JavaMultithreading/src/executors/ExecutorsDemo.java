package executors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(15);

		try {
			long startTime = System.currentTimeMillis(); // 🕒 Start time

			// Map to associate each Future with its corresponding number
			Map<Integer, Future<Long>> resultsMap = new HashMap<>();

			for (int i = 1; i <= 10; i++) {
				final int number = i; // 🔒 Capture loop variable correctly
				Callable<Long> task = () -> calculateFactorial(number);
				Future<Long> future = executor.submit(task);
				resultsMap.put(number, future);
			}

			// Retrieve and print each result
			for (Map.Entry<Integer, Future<Long>> entry : resultsMap.entrySet()) {
				int number = entry.getKey();
				long result = entry.getValue().get(); // Main thread waits
				System.out.println("Factorial of " + number + " is: " + result);
			}

			long endTime = System.currentTimeMillis(); // 🕒 End time
			System.out.println("Execution Time: " + (endTime - startTime) + " ms ");

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}
	}


	public static long calculateFactorial(int n) throws InterruptedException {
		Thread.sleep(500);
		if (n <= 1)
			return 1;
		return n * calculateFactorial(n - 1);
	}

}
