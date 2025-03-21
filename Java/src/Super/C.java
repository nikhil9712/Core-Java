package Super;

public class C extends B{
	int Z;
	
	/*/public C() {
		System.out.println("From default block C !!");
	}*/
	
	C(int x,int Y,int Z)
	{   super(x,Y);
		this.Z=Z;
		System.out.println("From Parameterized block C !!");
	
	
	}
	
}
