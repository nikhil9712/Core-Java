package inheritance;

public class Electronics {
    String cname;
    String ceo;
    String location;
    
    public Electronics() {
		// TODO Auto-generated constructor stub
	}
    
   Electronics(String cname,String ceo,String location)
    {
    	this.cname=cname;
    	this.ceo=ceo;
    	this.location=location;
    }
    
    public void displayElectronics()
    {
    	System.out.println(cname);
    	System.out.println(ceo);
    	System.out.println(location);
    	//System.out.println("+++++++++++++++");
    }
}
