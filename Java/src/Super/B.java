package Super;

public class B extends A{
	
	   int Y;  
	 /* public B() {
		System.out.println("From default B !!");
	}*/
	  
	  B(int x,int Y)
	  { super(x);
		this.Y=Y;
		System.out.println("From Parameterized B !!");
		
	  }  
	}



