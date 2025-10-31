package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenThreadClassExecutors {

    private static final Object lock = new Object();
    private static int number = 1;
    private static final int MAX = 100;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable runnable1 = () -> {
            while (true) {
                synchronized (lock) {
                    while (number % 2 == 0) { // Wait for odd turn
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }

                    if (number > MAX) {
                        lock.notifyAll();
                        break;
                    }

                    System.out.println("Thread1: " + number);
                    number++;
                    lock.notifyAll();
                }
            }
        };

        Runnable runnable2 = () -> {
            while (true) {
                synchronized (lock) {
                    while (number % 2 != 0) { // Wait for even turn
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }

                    if (number > MAX) {
                        lock.notifyAll();
                        break;
                    }

                    System.out.println("Thread2: " + number);
                    number++;
                    lock.notifyAll();
                }
            }
        };

        // Submit both once — not inside a loop
        executorService.submit(runnable1);
        executorService.submit(runnable2);

        executorService.shutdown();
    }
}
