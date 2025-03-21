package Hashset;
import java.util.ArrayList;
import java.util.HashSet;
public class BagDriver 
{
 public static void main(String[] args) {
      
	 
	 Bag b1=new Bag("nike",3300);
	 Bag b2=new Bag("adidas",2100);
	 Bag b3=new Bag("nike",3300);
	 Bag b4=new Bag("skybag",1800);
	 Bag b5=new Bag("american",4400);
	 Bag b6=new Bag("nike",3300);
	 
	
	 HashSet<Bag> hs=new HashSet<>();
	
	hs.add(b1);
	hs.add(b2);
	hs.add(b3);
	hs.add(b4);
	hs.add(b5);
	hs.add(b6);
	
	 
	 System.out.println(hs);
}
 
}
