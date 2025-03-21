package inheritance;

public class ElectrinicsDriver {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile("Redmi","Chin-Chang","Mumbai","Redmi note 15", 300000.00,"Black", 12, 256);
		{
			
		}
		
		m1.displayElectronics();
		m1.displayMobile();
		System.out.println("********");
		
		Laptop l1=new Laptop("Redmi", "Ching-Chang","Mumbai", "Redmi I7+", 750000.00,"Black", 16, 1000);
		
		l1.displayElectronics();
		l1.displayLaptop();
		
	}
}
