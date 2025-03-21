package Encspdulation;

public class Practise5 {
	private String name="Union bank";
	private int accno=1234;
	private int pass=3434;
	
	public String Displayname()
	{
		return name;
	}
	public int displayacc(int num)
	{
		if (num==accno) {
			return accno;
		}
		return 0;
	}
	public int displaypass()
	{
		return pass;
	}
	
	
	public void setpass(int num,int Epass,int newPin)
	{
		if (accno==num && pass==Epass) {
			pass=newPin;
		}
	}
}
