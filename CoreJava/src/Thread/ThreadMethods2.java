package Thread;

public class ThreadMethods2 extends Thread{
	
	public void run()
	{
		System.out.println("Task is performed by : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		System.out.println("Hello is printed by : "+Thread.currentThread().getName());
		ThreadMethods2 methods2=new ThreadMethods2();
		methods2.start();
		
	}

}
