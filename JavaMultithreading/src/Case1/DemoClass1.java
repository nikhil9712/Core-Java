package Case1;

public class DemoClass1 {

	public static void main(String[] args) {
		MyThread1.mt=Thread.currentThread();
		MyThread1 thread1 = new MyThread1();
		//thread1.setPriority(10);
		thread1.start();
	//	thread1.run();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
