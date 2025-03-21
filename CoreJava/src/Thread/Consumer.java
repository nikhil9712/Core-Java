package Thread;

public class Consumer extends Thread{

	Company company;

	public Consumer(Company company) {
		this.company = company;
	}
	public void run()
	{
		int n=1;
		while (true) {
			company.consume_item(n);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			
		}
	}
}
