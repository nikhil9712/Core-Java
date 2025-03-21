package Interfaces;

public interface Instagram {

	void login(String name,String pass);
	
	void message();
	
	 static void welcome(String name)
	 {
		 System.out.println("heyyy "+name+" welcome to Instagram");
	 }
}
