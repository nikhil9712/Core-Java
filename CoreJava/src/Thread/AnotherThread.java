package Thread;

public class AnotherThread extends Thread{

	@Override
	public void run() {
		for (int i = 31; i <=50; i++) {
			System.out.println(i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
