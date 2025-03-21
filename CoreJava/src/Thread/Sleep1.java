package Thread;

public class Sleep1 extends Thread {

	public void run() {
		System.out.println("Task starts");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException exception)
			{
				exception.printStackTrace();
			}
		}
		System.out.println("Task Ends");
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
//		Sleep1 thread=new Sleep1();
//		thread.start();
//		Sleep1 thread2=new Sleep1();
//		thread2.start();
		
		//Executes run method completely for a object and
		//then executes the run method for the another object
		Sleep1 sleep1=new Sleep1();
		sleep1.run();
		Sleep1 sleep2=new Sleep1();
		sleep2.run();
		System.out.println("Main ends");
	}
}
