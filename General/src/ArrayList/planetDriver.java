package ArrayList;

public class planetDriver {

	public static void main(String[] args) {
		
		Planet[] p=new Planet[4];
		
		p[0]=new Planet("Earth", new String[]{"h2o","co2"});
		p[1]=new Planet("Uranus", new String[]{"ccl4","ch4"});
		p[2]=new Planet("Mars", new String[]{"n2o","h2so4"});
		p[3]=new Planet("Pluto", null);
		
		System.out.println(p);
		System.out.println(p[0]); //Earth
		System.out.println(p[0].atm[1]); //co2
		
		
	}
}
