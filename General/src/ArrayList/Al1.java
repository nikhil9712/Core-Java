package ArrayList;
import java.util.ArrayList;
public class Al1 {

	public static void main(String[] args) {
		
		ArrayList o=new ArrayList<>();
		o.add("VOTER1");
		o.add("VOTER2");
		o.add("VOTER3");
		o.add("VOTER4");
		
		
		System.out.println(o);
		
		String s="VOTER1";
		int i;
		for ( i= 0; i < o.size(); i++) 
		{
			if (s.equals(o.get(i))) 
			{
			    
				System.out.println("Book exists !!");
				break;
			}
			System.out.println(o.get(i)+" "+i);
		}
		
		System.out.println(o.size());
		if (i==o.size())
		{
		System.out.println("Book not exists !!");	
		}
		//int a=10;
		System.out.println(o.contains(s));
		//System.out.println(o.contains(a));
		
		
	}
}
