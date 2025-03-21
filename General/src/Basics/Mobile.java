package Basics;

public class Mobile {

	String company;
	int price;
	Battery b=new Battery("Amron", 4200);
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	Mobile(String company,int price)
	{
		this.company=company;
		this.price=price;
	}
	
	public void displayMobile()
	{
		System.out.println(company);
		System.out.println(price);
		b.displayBattery();
	}
}
