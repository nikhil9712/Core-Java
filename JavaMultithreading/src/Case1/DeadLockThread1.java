package Case1;

public class DeadLockThread1 extends Thread {

	@Override
	public void run() {
		try {
			join();
			System.out.println("DeadLock thread 1"); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
