package ArrayList;

public class Planet {
	String name;
	String[]atm;

	public Planet(String name,String[]atm)
	{
		this.atm=atm;
		this.name=name;
	}
	
	public String toString()
	{
		return("[Name: "+name+" ]");
	}
}
