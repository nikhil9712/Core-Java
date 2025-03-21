package Thread;

public class ThreadOP {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		int a=25+35;
		System.out.println(a);
		Thread th=Thread.currentThread(); //static method in Thread class
		String tname=th.getName();
		System.out.println("The name of current running thread is : "+tname);
		th.setName("NewMain");
		String newName=th.getName();
		System.out.println("The name of current running thread is : "+newName);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		System.out.println("Thread started again");
		long tid=th.getId();
		System.out.println("The id of current thread is "+tid);
		System.out.println("Main ended");
	}
}
