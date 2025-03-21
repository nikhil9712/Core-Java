package Thread;

public class YeildMain {

	public static void main(String[] args) {
		
		DemoThread1 d1=new DemoThread1();
		Thread thread1=new Thread(d1);
		DemoThread2 d2=new DemoThread2();
		Thread thread2=new Thread(d2);
		
		thread1.start();
		thread2.start();
	}
}
