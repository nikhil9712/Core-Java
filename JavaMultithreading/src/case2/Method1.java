package case2;

public class Method1 {
	
	
	public synchronized  void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Welcome : "+name);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Interrupted Exception occured");
			}
		}
	}
}
