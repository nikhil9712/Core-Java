package Thread;

public class ThreadMethods1 implements Runnable{

	public void run()
	{
		System.out.println("Task 1");
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		ThreadMethods1 methods1=new ThreadMethods1();
		Thread thread=new Thread(methods1);
		String tName=thread.getName();
		System.out.println(tName);
		thread.setName("Change");
		String newName=thread.getName();
		System.out.println("New Thread Name: "+newName);
		System.out.println(thread.isAlive());
		System.out.println("Main Ends");
		System.out.println("***********");
		Thread currentThread=Thread.currentThread();
		String cThreadName=currentThread.getName();
		System.out.println(cThreadName);
		currentThread.setName("Nikhil Thread");
		String newCName=currentThread.getName();
		System.out.println("new Current Thread name : "+newCName);
		System.out.println(currentThread.isAlive());
		System.out.println(currentThread.isDaemon());;;
		thread.start();
		System.out.println(thread.isAlive());
	//	System.out.println(10/0); //Exception in thread "Nikhil Thread"
		
	}
}
