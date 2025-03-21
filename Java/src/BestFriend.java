
public class BestFriend extends Friend{
 String favouriteSong;

 public BestFriend() {
	// TODO Auto-generated constructor stub
}

public BestFriend(String name, String hometown,String favouriteSong) {
	super(name, hometown);
	this.favouriteSong=favouriteSong;
	// TODO Auto-generated constructor stub
}
public void  getStatus(String name, String hometown,String favouriteSong)
{
	System.out.println(name+"is a Friend and he is from " +hometown+" his favorite song is "+favouriteSong);
	}

 public static void main(String[] args) {
	
	 BestFriend a =new BestFriend();
	 System.out.println("Hello");
	 a.getStatus("Anish", "Pune", "mahi ve");
	 
}
 
}
