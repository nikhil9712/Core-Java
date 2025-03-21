package Thread;

public class Company {

	int n;
	boolean f = true;

	synchronized public void procuce_item(int n) {
		if (f==false) 
		{
			try
			{
				wait();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		}	
		this.n = n;
		System.out.println("produced :" + n);
		f=false;
		notify();
	}

	synchronized public void consume_item(int n) {
		if (true) {
			try
			{
				wait();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Consumed :" + n);
		f=true;
		notify();
	}
}
