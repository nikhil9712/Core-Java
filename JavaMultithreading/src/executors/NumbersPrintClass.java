package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumbersPrintClass {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		for (int i = 0; i <= 200; i++) {
			final int n = i;

			Runnable r = () -> {
				System.out.println(Thread.currentThread() + "" + n);
			};
			executorService.submit(r);
		}

		executorService.shutdown();

	}
}
