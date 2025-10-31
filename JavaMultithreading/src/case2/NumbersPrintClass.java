package case2;

public class NumbersPrintClass {

	public static void main(String[] args) {
		NumbersPrintThreadClass numbersPrintThreadClass = new NumbersPrintThreadClass();

		Thread thread1 = new Thread(numbersPrintThreadClass);
		Thread thread2 = new Thread(numbersPrintThreadClass);
		Thread thread3 = new Thread(numbersPrintThreadClass);

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
