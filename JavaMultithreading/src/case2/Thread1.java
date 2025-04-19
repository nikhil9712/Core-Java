package case2;

public class Thread1 extends Thread {

	private Method1 method1;
	private String name;

	Thread1(Method1 method1, String name) {
		this.method1 = method1;
		this.name = name;
	}

	@Override
	public void run() {
		method1.wish(name);
	}
}
