package inheritance;

public class Mobile extends Electronics {
String modelName;
double price;
String mColor;
int  mRam;
int mRom;

  public Mobile() 
  {
	// TODO Auto-generated constructor stub
}
  Mobile(String cname,String ceo,String location,String modelName,double price,String mColor,int  mRam,int mRom)
  {   super(cname,ceo,location);
	  this.modelName=modelName;
	  this.mColor=mColor;
	  this.price=price;
	  this.mRam=mRam;
	  this.mRom=mRom;
  }
  
  public void displayMobile()
  {   
	  displayElectronics();
	 
	  System.out.println(modelName);
	  System.out.println(mColor);
	  System.out.println(price);
	  System.out.println(mRam);
	  System.out.println(mRom);
  }
}
