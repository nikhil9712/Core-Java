package ArrayList;
import java.util.Scanner;
public class A1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	 
	String[]name=new String[4];
	
	for (int i = 0; i < name.length; i++) 
	{   
		System.out.println("Enter name: ");
		name[i]=sc.next();
	}

	for (int i = 0; i < name.length; i++) 
	{   
		System.out.println(name[i]);
		
	}
	
	System.out.println("Select Candidate you want : ");
	String candidate=sc.next();
	
    boolean ans=true;
    
	for (int i = 0; i < name.length; i++) 
	{   
		if (candidate.equalsIgnoreCase(name[i])) 
		{
			System.out.println("candidate is available");
			ans=false;
			break;
		}
	}
	if(true) 
	{
		System.out.println("candidate is not available !!");
	}
	
	
	
	
}
}
