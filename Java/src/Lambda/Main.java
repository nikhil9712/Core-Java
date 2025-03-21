package Lambda;

public class Main {

	
	public static void main(String[] args) {
		
		System.out.println("Main starts.. ");
	
		/*
		MyInterImpl a1=new MyInterImpl();
		a1.sayHello();
		
		MyInter myinter=new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("This is 1st anonyous class");
				
			}
		};
		myinter.sayHello();
		

		MyInter myinter2=new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("This is 2nd anonyous class");
				
			}
		};
		myinter2.sayHello();
		*/
		MyInter i=()->{
			System.out.println("This is first time i used lambda");
		};
		i.sayHello();
		
		Sum s=(a,b)->(a+b);
		
		System.out.println(s.sum(250, 150));
	}
}
