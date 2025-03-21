package Basics;
import java.util.Scanner;
public class PassVerification {

	static int attempt=0;
	
	static int pass=6445;
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	  do
	  {
		  System.out.println("Enter Pass: ");
		  int Enteredpass=sc.nextInt();
		  
		  if (Enteredpass==pass )
		  {
			  System.out.println("Password verified !!");
			  break;
			
	      } 
		  else
		   {
             attempt++;
		   }
		//  System.out.println(attempt);
	  }
	  while(attempt<3);
	  
	  if (attempt==3) 
	  {
		System.out.println("Envalid Credentials !! Please try again Later !!");
		
	  }
	
	 /*
	  * do while is generally 
	  */
	}
}
