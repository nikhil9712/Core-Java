package Hashset;

public class Laptop{

	String company;
	int price;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Laptop(String company,int price) 
	{
		this.company=company;
		this.price=price;
	}
	
	public String toString()
	{
		return("[Company: "+company+", Price: "+price+" ]");
	}
	
	public int hashCode()
	{
		int hc=company.hashCode()+price;
		return hc;
	}
	
	
	public boolean equals(Object o)
	{
		Laptop obj=(Laptop) o;
		
		if ( this.company.equals(obj.company) && this.price==obj.price )
		{
			return true;
		}
		return false;
	}


	
	
}
