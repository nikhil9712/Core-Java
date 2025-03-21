package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class TeamsDriver {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	
	
	ArrayList IPL=new ArrayList<>();
	
	IPL.add(new Teams("GT", 18, new char[]{'W','L','W','W','L'}));
	
	IPL.add(new Teams("CKS", 15, new char[]{'L','W','W','W','L'}));
	
	IPL.add(new Teams("LSG", 15, new char[]{'W','W','L','W','L'}));
	
	IPL.add(new Teams("MI", 14, new char[]{'L','W','W','W','W'}));
	
	IPL.add(new Teams("RCB", 12, new char[]{'W','L','L','W','L'}));
	
	IPL.add(new Teams("RR", 12, new char[]{'L','W','L','L','L'}));
	
	IPL.add(new Teams("KKR", 12, new char[]{'W','L','W','W','L'}));
	
	IPL.add(new Teams("PKBS", 12, new char[]{'L','W','L','L','W'}));
	
	IPL.add(new Teams("DC", 10, new char[]{'W','L','L','W','W'}));
	
	IPL.add(new Teams("SRH", 8, new char[]{'L','L','L','L','W'}));
	
	System.out.println("Enter desired consecutive Losses: ");
	int losses=sc.nextInt();
	System.out.println("chhose the result: ");
	for (int i = 0; i < IPL.size(); i++) 
	{   
		Teams obj=(Teams) IPL.get(i); //Downcasting
		int count=0;
		 
		for (int j = 0; j < 5; j++) 
		{  
			if (obj.result[j]==sc.next().charAt(0)) 
			{
				count++;
			}
			else
			{
				if (count<losses)
				{
					count=0;
				} 
			}
		}
		if (count>=losses) 
		{
	      System.out.println(obj);	
	      System.out.println("**********");
		}
		
	}
}
}
