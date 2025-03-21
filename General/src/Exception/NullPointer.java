package Exception;

public class NullPointer 
{
  public static void main(String[] args) {
	
	  String name=null;
	  
	try
	{
		  System.out.println(name.equals("hello"));
	}
	catch(NullPointerException e)
	{
		System.out.println("Null value can not be compared !!");
	}

	/*  String s;
	  System.out.println(s.length());
	  variable should be initialize
	  */
	}
	
  
}
