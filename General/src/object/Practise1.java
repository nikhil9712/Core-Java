package object;

public class Practise1 extends Object
{
   int a;
   int b;
   int c;
	 public static void main(String[] args) throws InterruptedException {
		
		 Practise1 p1=new Practise1();
		 p1.a=100;
		 p1.b=200;
		 p1.c=300;
		
	     int a=10;
	     int b=15;
	     int c=20;
	     
	     String s="Sanket";
	     String s1="Nikhil";
	     String s2="Sanket";
	     
	     String s3=new String("ajay");
	     String s4=new String("ajay");
	     
	     System.out.println(s.hashCode());
	     System.out.println(s.hashCode());
	     System.out.println(s2.hashCode());
	     System.out.println(s3.hashCode());
	     System.out.println(s4.hashCode());
	     
	     System.out.println(s.equals(s1));
	     System.out.println(s.equals(s2));
	     
	     System.out.println(s3.equals(s4));
	     
	     System.out.println(p1.toString());
	     
	     for (int i = 1; i <=5; i++)
	     {  
	    	 p1.wait(i);
		}
	     
	      
	 
	 
	 
	 
	 
	 }
	
}
