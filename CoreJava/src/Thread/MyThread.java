package Thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i);
			try
			{
				sleep(1000); //shows checked exception InterruptedException
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
        //First thread
		MyThread t = new MyThread();
		t.start();
		
		AnotherThread t2=new AnotherThread();
		t2.start();
	}
}
