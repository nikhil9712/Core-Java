package Encspdulation;

public class PractiseDriver extends Practise5{
public static void main(String[] args) {
	Practise5 A=new Practise5();
	
	System.out.println(A.displayacc(1234));
	System.out.println(A.Displayname());
	
	A.setpass(1234,344894,5555);
	System.out.println(A.displaypass());
	
	A.setpass(1234,3434,5555);
	System.out.println(A.displaypass());
}
}
