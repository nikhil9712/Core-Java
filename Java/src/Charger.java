 
public class Charger 
{

	int price;
	String company;
	String type;
	
	public Charger(int Price,String Company,String Type) 
	{
		price=Price;
		company=Company;
		type=Type;
	}
	
	public String toString()
	{
		return "[ Price:"+price+" Company:"+company+" Type:"+type+" ]";
	}
	
	public int hashCode()
	{
		int hc=0;
		hc=hc+price;
		hc=hc+company.hashCode();
		hc=hc+type.hashCode();
		return hc;
	}
	
	public boolean equals(Object i)
	{  
		Charger c=(Charger) i;
		if (this.company==c.company && this.price==c.price && this.type==c.type) {
			return true;
		}
		return false;
	}
	
	
	
	
}
