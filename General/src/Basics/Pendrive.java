package Basics;

public class Pendrive {

	String company;
	int capacity;
	
	public Pendrive(String company, int capacity) {
		super();
		this.company = company;
		this.capacity = capacity;
	}
	
	public void displayPendriver()
	{
		System.out.println("Pendrive company: "+company);
		System.out.println("Pendrive capacity: "+capacity);
	}
	
	
}
