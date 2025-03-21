
public class Split {
public static void main(String[] args) {
	
	String s="Hello Pratik How Are You ?? Where are you Pratik ??";
	
	String[]A=s.split(" ");
	
	
	
	
	 
	for (int i = 0; i < A.length; i++)
	{ 
		System.out.println(A[i]);
	  for (int j = i+1; j < A.length-1; j++) 
	  { System.out.println(A[j]);
		if (A[i]==A[j]) 
		{
			System.out.println(A[j]);
		}
	  }
    }
}
}
