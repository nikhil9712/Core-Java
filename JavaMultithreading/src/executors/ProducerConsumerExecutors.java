package executors;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExecutors {

    public static void main(String[] args) {
        // Shared queue with a capacity of 5
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        // Create a thread pool with 2 threads (1 producer, 1 consumer)
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Producer
        Runnable producer = () -> {
            int number = 1;
            try {
                while (number <= 20) {
                    queue.put(number); // waits if queue is full
                    System.out.println(Thread.currentThread().getName() + " produced: " + number);
                    number++;
                    Thread.sleep(200); // simulate time to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Consumer
        Runnable consumer = () -> {
            try {
                while (true) {
                    Integer value = queue.take(); // waits if queue is empty
                    System.out.println(Thread.currentThread().getName() + " consumed: " + value);
                    Thread.sleep(300); // simulate time to consume

                    if (value == 20) break; // stop when last number consumed
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Submit tasks to ExecutorService
        executor.submit(producer);
        executor.submit(consumer);

        // Graceful shutdown
        executor.shutdown();
    }
}
