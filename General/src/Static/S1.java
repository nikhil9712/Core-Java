package Static;

public class S1 {
int a;
static int b;
  static
    {
	System.out.println("Hello");
	System.out.println(b);
	//System.out.println(a);  //CTE
	}
  

public static void main(String[] args) {
	
	
	b=500;
	System.out.println(b);
	int a=15;
	System.out.println(a); //15
	                       //20
	
	S1 s=new S1();
	s.sum(80);  //90
	
}
public void sum(int a)
{
	System.out.println(a+10);   //local variable
	System.out.println(this.a+10); //Global non static
	}
}
