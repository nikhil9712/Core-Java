package ArrayList;
import java.util.ArrayList;
public class Al2 
{
 
public static void main(String[] args) {
	
	  ArrayList A=new ArrayList<>();
	  
	  A.add("Ramesh");
	  
	  A.add("Suresh");
	  A.add("Ajay");
	  A.add("Vijay");
	  A.add("Mangesh");
	  
	  String s="viJay";
	 
	  if (contains(A, s))
	  {
		System.out.println("Book is Available");
		remove(A, s);
		System.out.println(A);
	}
	  else
	{
      System.out.println("book is not available");
	}
   
}
 
  public static boolean contains(ArrayList A,String s)
  {
	  for (int i = 0; i < A.size(); i++) 
	  {
		  String a=(String) A.get(i);
		if (s.equalsIgnoreCase(a)) 
		{
		 return true;	
		}
	}
	  return false;
  }
  
  public static void remove(ArrayList A,String s)
  {
	 for (int i = 0; i <A.size(); i++) 
	 {
	   if (s.equalsIgnoreCase((String)A.get(i))) 
	   {
		A.remove(i);
	}	
	}
		
	}
	  
	
  
}
