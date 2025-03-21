package inheritance;

public class Banking {
      static double balance;
      
      public static void main(String[] args) 
      {
		deposit(1000);
		withdraw(-500);
      }
    	  public static void withdraw(double amount)
    	  {
    		 if (balance>0) {
				balance=balance-amount;
				System.out.println("your current balkance is : "+balance);
			}
    		 else {
				System.out.println("insufficient balance");
			}
    	  }
	
    	  
    	  public static void deposit(int amount)
    	  {
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
