package Thread;

public class ExecutionPrevent extends Thread{

	public void run()
	{
		System.out.println("Task started ");
		try
		{
		Thread.sleep(3000);
		//Thread.sleep(-1); Illegeal argument exception  
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		System.out.println("Task Completed ");
	}
	public static void main(String[] args) {
		
		System.out.println("Main starts");
		ExecutionPrevent thread=new ExecutionPrevent();
		thread.start();
		try
		{
		Thread.sleep(4000);
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		
		System.out.println("Main ends");
	}
}
