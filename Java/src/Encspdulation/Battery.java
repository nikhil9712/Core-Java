package Encspdulation;

public class Battery {

	//Has A Relationship
    
	String Name;
	int capacity;
	
	
	public Battery() {
		// TODO Auto-generated constructor stub
	}
	
	Battery(String Name,int capacity)
	{
		this.Name=Name;
		this.capacity=capacity;
		
		System.out.println("Battery Inserted !!");
	}
	
	public void displayBattery()
	{
		System.out.println(Name);
		System.out.println(capacity);
		
		System.out.println("Details of Battery Displayed !!");
	}
		
}






















