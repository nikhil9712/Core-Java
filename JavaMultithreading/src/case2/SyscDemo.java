package case2;

public class SyscDemo {
	
	public static void main(String[] args) {

		Method1 method1 = new Method1();
		Method1 method2 = new Method1();

		Thread1 thread1 = new Thread1(method1, "Dhoni");
//		Thread1 thread2 = new Thread1(method2, "Kohli");
		Thread2 thread2 = new Thread2(method1, "Kohli");

		thread1.start();
		thread2.start();
	}
}
