package encapsulation;

public class Country {
String cname;
String president;
String PM;
int cpopulation;

 public Country() {
	// TODO Auto-generated constructor stub
}
 Country(String cname,String president,String PM,int cpopulation)
 {
	 this.cname=cname;
	 this.president=president;
	 this.PM=PM;
	 this.cpopulation=cpopulation;
 }
 
 public void displayCountry()
 {
	 System.out.println(cname);
	 System.out.println(president);
	 System.out.println(PM);
     System.out.println(cpopulation);
     System.out.println("+++++++++++++");
 }
 
}
