package Hashset;

public class PlanetDriver {

	public static void main(String[] args)
	{
		Planet[]planet=new Planet[4];
		
		Planet p1=new Planet("Jupiter", 4, true,new String[] {"H2o","ccl4","ch4"});
		Planet p2=new Planet("Earth", 11, false,new String[] {"Co2","H2so4","O2"});
		Planet p3=new Planet("Mars", 2, true,new String[] {"CH4","No2"});
		Planet p4=new Planet("Jupiter", 4, true,new String[] {"h2so4","ccl2","Ps4"});
        
		planet[0]=p1;
		planet[1]=p2;
		planet[2]=p3;
		planet[3]=p4;
		
		String[]gas=dominantGas(planet);
		for (int i = 0; i < gas.length; i++) {
		System.out.println(gas[i]);	
		}
		int moons=moonCount(planet);
		System.out.println(moons);
	}
	
	public static int moonCount(Planet[]planet)
	{
		int ct=0;
        for (int i = 0; i < planet.length; i++) {
			if (planet[i].ring==true) {
				ct+=planet[i].moons;
			}
		}

		return ct;
		
	}
	public static String[] dominantGas(Planet[]s)
	{
		int size=0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].atmosphere!=null) {
				size=size+s[i].atmosphere.length;
			}
		}
		
		String[]gas=new String[size];
		int index=0;
		for (int i = 0; i < s.length; i++)
		{
			if (s[i].atmosphere!=null) {
				for (int j = 0; j <s[i].atmosphere.length; j++) {
					gas[index]=s[i].atmosphere[j];
					index++;
				}
			}
		}
		return gas;
	}
}
