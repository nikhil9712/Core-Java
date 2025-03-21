package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class AL3 
{
  public static void main(String[] args) {
	
	  ArrayList A1=new ArrayList<>();
	  
	  A1.add("Nike");
	  A1.add("Adidas");
	  A1.add("One8");
	  A1.add("Bata");
	  A1.add("Sparx");
	  
	/*  for (int i = 0; i < A1.size(); i++) 
	  {
		System.out.println(A1.get(i));
	  }
	  */
	 
	 Iterator i =A1. iterator();
	 
	 System.out.println(i.next());
	 System.out.println(i.hasNext());
	 System.out.println(i.next());
	 System.out.println(i.hasNext());
	 System.out.println(i.next());
	 System.out.println(i.hasNext());
	 System.out.println(i.next());
	 System.out.println(i.hasNext());
	 System.out.println(i.next());
	 System.out.println(i.hasNext());
	
}
}
