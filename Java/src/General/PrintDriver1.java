package General;

public class PrintDriver1 {

	public static void main(String[] args) {
		
		Hp1 h1=new Windows1();
		h1.print();
		//h1.xerox();
		
		Windows1 w=new Windows1();
		w.print();
		w.xerox();
		

		Hp1 h2=new Linux1();
		h2.print();
		//h1.xerox();
		
		Linux1 l=new Linux1();
		l.print();
		l.Xerox();
	}
}
