package General;

public class CheckClass extends Check2{

	public void message()
	{
		System.out.println("No Problem abstract class without method !!");
	}
	
	public CheckClass() {
		super();
		System.out.println("Constructor loaded");
	}
	
}
