package General;

public class PrintDriver {

	public static void main(String[] args) {
		
		Hp h=new Windows();
		h.print();
		//h.Xerox();
		
		Windows w=new Windows();
		h.print();
		w.Xerox();
		
		Hp h1=new Linux();
		h1.print();
		//h1.Xerox();
		
		Linux l=new Linux();
		l.print();
		l.Xerox();
		
		
		
	}
}
