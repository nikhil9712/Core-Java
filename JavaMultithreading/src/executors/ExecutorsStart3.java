package executors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsStart3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		
		Callable<String> callable1 = () -> {
			System.out.println("Task 1 Completed");
			return "Task1";
		};
		
		Callable<String> callable2 = () -> {
			System.out.println("Task 2 Completed");
			return "Task2";
		};

		Callable<String> callable3 = () -> {
			System.out.println("Task 3 Completed");
			return "Task3";
		};
		List<Callable<String>> callables=Arrays.asList(callable1,callable2,callable3);
		List<Future<String>> futures = executorService.invokeAll(callables);
		System.out.println();
		
		for (Future<String> future : futures) {
			System.out.println(future.get());
		}
		


	}

}
