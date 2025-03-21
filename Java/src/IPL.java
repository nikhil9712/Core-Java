
public class IPL {

	String name;
	int points;
	char[]results;
	
	
	public IPL(String name, int points, char[] results) {
		super();
		this.name = name;
		this.points = points;
		this.results = results;
	}


	@Override
	public String toString() {
		return "Class [name=" + name + ", points=" + points + "]";
	}
	
	
}
