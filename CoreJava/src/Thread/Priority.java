package Thread;

public class Priority extends Thread{

	public void run()
	{
		System.out.println("Task");
	}
	public static void main(String[] args) {
		Thread tName=Thread.currentThread();
		int mainPriority=Thread.currentThread().getPriority();
		System.out.println(tName);
		System.out.println("The Current thread that is "+ tName+" has the priority of "+mainPriority);
		Thread.currentThread().setPriority(8);
		Priority priority=new Priority();
		System.out.println("The priority of current thread is"+Thread.currentThread().getPriority());
		System.out.println("The Priority Of the Sub thread is : "+priority.getPriority());
		Thread.currentThread().setPriority(NORM_PRIORITY);
		priority.setPriority(4);
		System.out.println("The Id Of the current thread is : "+Thread.currentThread().getId());
		System.out.println("The Priority Of the Sub thread is : "+priority.getPriority());
		System.out.println("The Id Of the Sub thread is : "+priority.getId());
		priority.setDaemon(false);
	}
}
