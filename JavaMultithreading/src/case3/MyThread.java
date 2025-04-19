package case3;

public class MyThread extends Thread{

	int total =0;
	
	@Override
	public void run() {
		
		for (int i = 0; i <=100; i++) {
			total+=i;
		}
	}
}
