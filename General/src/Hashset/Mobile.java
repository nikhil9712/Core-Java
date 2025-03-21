package Hashset;

public class Mobile {
String company;
int price;

     public Mobile() 
     {
	// TODO Auto-generated constructor stub
     }
 
     public Mobile(String brand,int price) 
     {
	   company=brand;
	   this.price=price;
     }
     public String toString()
     {
    	 return("Brand: "+company+"Price: "+price);
     }
     public int hashcode()
     {
    	 int hc=company.hashCode()+price;
    	 return hc;
     }
     
     @Override
     public boolean equals(Object o)
 	{
    	 Mobile obj=(Mobile) o;
 		
 		if ( this.company.equals(obj.company) && this.price==obj.price )
 		{
 			return true;
 		}
 		return false;
 	}
}
