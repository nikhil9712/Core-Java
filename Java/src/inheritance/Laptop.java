package inheritance;

public class Laptop extends Electronics {
   String lName;
   double price;
   String lColor;
   int ram;
   int rom;
   
   public Laptop() {
	// TODO Auto-generated constructor stub
}
   
   Laptop(String cname,String ceo,String location,String lName,double price,String lColor,int ram,int rom)
   {
   	this.cname=cname;
   	this.ceo=ceo;
   	this.location=location;
    this.lName=lName;
    this.price=price;
    this.lColor=lColor;
    this.ram=ram;
    this.rom=rom;
   }
   
   public void displayLaptop()
   {
	  displayElectronics();
	  System.out.println(lName);
	  System.out.println(price);
	  System.out.println(lColor);
	  System.out.println(ram);
	  System.out.println(rom);
   }
}
