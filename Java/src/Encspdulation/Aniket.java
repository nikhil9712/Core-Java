package Encspdulation;

public class Aniket {

	static {
		System.out.println("static"); // 1
	}
	{

		System.out.println("non static"); // 3
	}

	Aniket() {
		System.out.println("from constructor !!"); // 2 //4
	}

	public static void main(String[] args) 
	{
		Aniket Y = new Aniket();
		System.out.println("start !!"); // 5
	}
}
