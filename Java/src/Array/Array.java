package Array;

public class Array {
public static void main(String[] args) {
	for(int i=100;i<110;i++)
	{
	      int ct=0;
	   for(int j=10;j<20;j++)
	   {   
		   if(i%j==0)
		   {   ct++;
			   
		   }
		  
	   }
	   System.out.println(ct);
	   if(ct>1)
	   {   
		   System.out.println(i);
		  return;
	   }
	}
	
}

}
