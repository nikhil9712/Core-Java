package Thread;

public class Join extends Thread {
    static Thread mainThread;
	public void run() {
		try
		{
			mainThread.join();
		}
		catch(InterruptedException exception)
		{
			exception.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("child thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
       mainThread=Thread.currentThread();
		Join thread = new Join();
		//thread.start();
		//Thread.yield();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}
}
