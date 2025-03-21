package Basics;

public class Deskstop {

	String company;
	int price;
	int ram;
	int rom;
    Pendrive p;
	public Deskstop(String company, int price, int ram, int rom) {
		super();
		this.company = company;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		
	}
	public void insertPendrive()
	{
		p=new Pendrive("Sandisk", 520);
		System.out.println("pendrive Inserted !!");
	}
	public void displayDeskstop()
	{
		System.out.println("Deskstpo Company: "+company);
		System.out.println("Deskstpo price: "+price);
		System.out.println("Deskstpo ram: "+ram);
		System.out.println("Deskstpo rom: "+rom);
		p.displayPendriver();
	}
}
