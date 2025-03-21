package Basics;

public class Battery {

	String company;
	int capacity;
	
	public Battery() {
		// TODO Auto-generated constructor stub
	}
	Battery(String company,int capacity)
	{
		this.company=company;
		this.capacity=capacity;
	}
	
	public void displayBattery()
	{
		System.out.println(company);
		System.out.println(capacity);
	}
}
