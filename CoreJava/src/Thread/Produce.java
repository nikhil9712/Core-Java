package Thread;

public class Produce extends Thread{

	Company company;
	
	public Produce(Company company) {
		this.company=company;
	}
	
	public void run()
	{  int n=1;
		while(true)
		{
			company.procuce_item(n);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		}
	}
}
