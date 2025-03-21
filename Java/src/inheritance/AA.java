package inheritance;

public class AA {
    static double balance;

    public static void main(String[] args) {
    	
    	AA a=new AA();
    	a.withdraw(5000);
    	a.deposit(1000);
    	
    }
		
  	  public static void withdraw(double amount) {
  	  
  		  if (amount >0) 
  		  {
  			  if (balance-amount>0) 
  			  {  
					balance=balance-amount;
					
					System.out.println("The amount successfully debited and your current account balance is : "+balance);
				   }
  			  else
  			  {
  				System.out.println("Insufficient balance: "+balance);
  			  }
  		  }  
				
			
  		  else
  		  {
  			  System.out.println("Please enter a valid amount !!");
  		  }
  	  }
    
  	  
  	  public static void deposit(int amount) {
  	  
  		  if (amount >0) 
  	   {
  			 balance=balance+amount;
				System.out.println("successfully deposited and your current balance is : "+balance);
		   }
  		  
  		  else
  		  {
  			  System.out.println("please enter a currect Amount !!");
  		  }
  	  
  	  
    }
    
}
    


