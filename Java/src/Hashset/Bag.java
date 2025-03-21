package Hashset;
public class Bag {

	String company;
	int price;
	
	public Bag() {
		// TODO Auto-generated constructor stub
	}
	public Bag(String company,int price)
	{
		this.company=company;
		this.price=price;
	}
	public String toString()
	{
		return("[company:"+company+", price: "+price+" ]");
	}
	public int Hashcode()
	{
		int hc=company.hashCode()+price;
		return hc;
	}
	
	
	
	public boolean equals(Object o)
	{
		Bag obj=(Bag) o;
		
		if ( this.price==obj.price )
		{
			return true;
		}
		return false;
	}
}
