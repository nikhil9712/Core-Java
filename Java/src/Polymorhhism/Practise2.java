package Polymorhhism;

public class Practise2 {

	 int num=100;
	 
	 public void update()
	 {
		 num=num+100;
	 }
	 
	 public static void main(String[] args) 
	 {
		
		Practise2 P1=new Practise2();
		
		P1.update();
		System.out.println(P1.num);
		
		P1.update();
		System.out.println(P1.num);
		
		P1.update();
		System.out.println(P1.num);
		
		System.out.println(P1.num+P1.num);
	}
}
