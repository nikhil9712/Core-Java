package Polymorhhism;

public class Bottle {
   String shape;
   String color;

   public void display()
   {
	   shape="Triangle";
	   color="red";
	   
	   System.out.println(shape);
	   System.out.println(color);
	   
   }
  void m1() {
	  this.display();
  }
   public static void main(String[] args) {
	   Bottle b=new Bottle();
	   b.m1();
}
}
