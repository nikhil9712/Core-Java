package Recursion;

public class Example1 {
    static int count=0;
	public static void main(String[] args) {
		print();
		
	}
	public static void print()
	{
	count++;
	if (count<=5) {
		System.out.println("Hello"+count);
		print();
	}
	}
}
