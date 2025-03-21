package Array;

public class Fibonccchi {

	public static void main(String[] args) {
		
		int count=10;
		for (int i = 0; i < count; i++) {
			int fib=fibo(i);
			System.out.println(fibo(fib));
			
		}
		
	}
	
	public static int fibo(int num)
	{   
		if (num==0 || num==1) {
			return 1;
		} else {
       return fibo(num-1)+fibo(num-2);
		}
		
	}
}
