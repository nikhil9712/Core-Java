package Thread;

public class DaemonThread extends Thread{

	public void run()
	{
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread");
		} else {
           System.out.println("Not a daemon thread");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Main Thread ");
		DaemonThread t1=new DaemonThread();
		t1.setDaemon(true);
		t1.start(); //this runns in background in main thread
		//we have to create Daemon thread before start()
		//else show IllegeanStateException
		
		
	}
}
