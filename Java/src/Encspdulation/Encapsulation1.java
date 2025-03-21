package Encspdulation;

public class Encapsulation1 {

	private String name;
	private int pass;
	private int accno;
	private int balance;
	
	public Encapsulation1() {
		
	}
	
	public Encapsulation1(String Name,int Pass,int AccNo,int Balance) {
		
		name=Name;
		pass=Pass;
		accno=AccNo;
		balance=Balance;
		System.out.println("Parameterised Constructor !!");
	}
	
	public String displayName()
	{
	
	   return name;
	}
	
	public int displayPass(int AccNo,int Pass)
	{
		if (AccNo==accno && Pass==pass) {
			return pass;
		}
		else
		{
			System.out.println("Enter a valid data !!");
		}
		return 0;
	}
	
	public void setPass(int AccNo,int Pass,int NewPass)
	{
		if (AccNo==accno && pass==Pass) {
			pass=NewPass;
			System.out.println("Pin updated !!");
		}
		else
		{
			System.out.println("Please Enter a correct Pin !!");
		}
		
	} 
	
	public int displayBalance(int Accno,int Pass)
	{
		if (Accno==accno && pass==Pass) {
			return balance;
		}
		else
		{
			System.out.println("Enter a valid data");
		    return 0;
		}
	}
	
	public void Withdraw(int Accno,int Pass,int Amount)
	{
		if (Accno==accno && Pass==pass) {
			
			if (balance-Amount>2000) {
				balance=balance-Amount;
				System.out.println("Withdraw successful!!");
				System.out.println("Your current balance is:  "+balance);
			} else {
              System.out.println("Ensufficient balance !!");
			}
		}
		else
		{
			System.out.println("Please enter valid details !!");
		}
		
	}
	
	public static void main(String[] args) {
		Encapsulation1 E1=new Encapsulation1("Nikhil",9712,9933,6000);
		System.out.println(E1.displayName());
		
		System.out.println(E1.displayPass(9933,9712));
		
		E1.setPass(9933, 9712, 9722);
		System.out.println(E1.pass);
		
		E1.displayBalance(9933, 9722);
		
		E1.Withdraw(9933,9722,2000);
		
		
	}
}
