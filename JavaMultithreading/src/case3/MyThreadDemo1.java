package case3;

public class MyThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread myThread=new MyThread();
		myThread.start();
		
		//Thread.sleep(100);
		System.out.println("Output trying to br consumed by main Thread : "+myThread.total);
	}
}
