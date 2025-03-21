package encapsulation;

public class State extends Country
{
String sname;
int spopulation;
String CM;

public State() {
	// TODO Auto-generated constructor stub
}

State(String cname,String president,String PM,int cpopulation,String sname,int spopulation,String CM)
{
	this.cname=cname;
	this.president=president;
	this.PM=PM;
	this.cpopulation=cpopulation;
	 
	this.sname=sname;
	this.spopulation=spopulation;
	this.CM=CM;
	}

public void displayState()
{  displayCountry();
   System.out.println(sname);
   System.out.println(spopulation);
   System.out.println(CM);
   System.out.println("+++++++++++++++++");
	}
}
