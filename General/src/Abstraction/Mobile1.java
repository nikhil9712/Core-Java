package Abstraction;

public class Mobile1 {
	String brand;
	int price;

	     public Mobile1() 
	     {
		// TODO Auto-generated constructor stub
	     }
	 
	     public Mobile1(String brand,int price) 
	     {
		   this.brand=brand;
		   this.price=price;
	     }
	     public String toString()
	     {
	    	 return("Brand: "+brand+"Price: "+price);
	     }
	     public int hashcode()
	     {
	    	 return brand.hashCode()+price;
	     }
	     public boolean equals(Object o)
	     {
	    	 Mobile1 obj=(Mobile1) o;
	    	 if (this.brand.equals(obj.brand) && this.price==obj.price)
	    	 {
			   return true;	
			 }
	    	 return false;
	     }
}
