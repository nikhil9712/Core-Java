
public class Friend extends Acquinantance{

	String homeTown;
	
	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name,String hometown) {
		super(name);
		this.homeTown=hometown;
		// TODO Auto-generated constructor stub
	}
	public void getStatus(String name,String homeTown)
	{
	   System.out.println(name+"is a Friend and he is from " +homeTown);;
	}
	
}
