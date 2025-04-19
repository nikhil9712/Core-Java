package case2;

public class Thread2 extends Thread {

	Method1 method1;
	String name;

	public Thread2(Method1 method1, String name) {
		this.method1 = method1;
		this.name = name;
	}

	public void run() {
		method1.wish(name);
	}
}
