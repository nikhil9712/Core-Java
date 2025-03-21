package Thread;

public class DemoThread1 implements Runnable{

	public void run()
	{
		for (int i = 1; i <=10; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			Thread.yield();
		}
	}
	
}
