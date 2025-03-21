package Encspdulation;

public class Mobile {
 String company;
 int ram;
 int rom;
 Battery b1;
 
 public Mobile() {
	// TODO Auto-generated constructor stub
}
 
 Mobile(String company,int ram,int rom)
 {
	 this.company=company;
	 this.ram=ram;
	 this.rom=rom;
 }
 
 public void displayMobile()
 {   b1=new Battery("Amron",4000);
	 b1.displayBattery();
	 System.out.println(company);
	 System.out.println(ram);
	 System.out.println(rom);
	 System.out.println("Details of Mobile Desplayed !!");
 }
 
 public static void main(String[] args) {

	Mobile M1=new Mobile("Apple",4,16);
	M1.displayMobile();
//	M1.b1.displayBattery();
	
}
 
	
}
