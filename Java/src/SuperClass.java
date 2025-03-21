
public abstract class SuperClass {

	private long accno;
	private int pass;
	
	public abstract void message();
	
	public SuperClass() {
		// TODO Auto-generated constructor stub
	}
	
	public SuperClass(long accno,int pass) {
		this.accno=accno;
		this.pass=pass;
	}
	
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	
	public void print()
	{
		System.out.println("Child class");
	}
	 
	
	
}
