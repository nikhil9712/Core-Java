package ArrayList;

public class Teams {

	String name;
	int point;
	char[]result;
	
	
	public Teams(String name,int point,char[]result)
	{
		this.name=name;
		this.point=point;
		this.result=result;
	}
	
	public String toString()
	{
		return("[Name: "+name+" Points: "+point+" ]");
	}
}
