package encapsulation;

public class District extends State {

	String Dname;
	String collector;
	int Dpopulation;
	
	public District() {
		// TODO Auto-generated constructor stub
	}
	
	District(String cname,String president,String PM,int cpopulation,String sname,int spopulation,String CM,String Dname,int Dpopulation,String collector)
	{
		this.cname=cname;
		this.president=president;
		this.PM=PM;
		this.cpopulation=cpopulation;
		 
		this.sname=sname;
		this.spopulation=spopulation;
		this.CM=CM;
		
		this.Dname=Dname;
		this.collector=collector;
		this.Dpopulation=Dpopulation;
		
	}
	
	public void displayDistrict()
	{
		displayState();
		System.out.println(Dname);
		System.out.println(collector);
		System.out.println(Dpopulation);
		System.out.println("++++++++++");
	}
}
