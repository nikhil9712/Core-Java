package All;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;


public class Cities {

	public static void main(String[] args) {
		
		Cities c=new Cities();
		TreeMap<String, HashMap <String, ArrayList<String>>> Dropdown=c.Print();
		System.out.println(Dropdown);
		
	}
	
	public TreeMap<String, HashMap <String, ArrayList<String>>> Print()
	{
        ArrayList<String> MHC=new ArrayList<>();
		
		MHC.add("Pune");
		MHC.add("Mumbai");
		MHC.add("Nagpur");
		MHC.add("Amravati");
		
		ArrayList<String> GJC=new ArrayList<>(); //Generics and diamond
	
		GJC.add("Surat");
		GJC.add("Amhedabad");
		GJC.add("Navsari");
		GJC.add("Valsad");
		
		ArrayList<String> MPC=new ArrayList<>();
		
		MPC.add("Indore");
		MPC.add("Bhopal");
		MPC.add("Jabalpur");
		MPC.add("Khandwa");
		
		HashMap <String, ArrayList<String>> State =new HashMap<>();
		State.put("Maharashtra", MHC);
		State.put("Gujrat", GJC);
		State.put("MadhyaPradesh", MPC);
		
		TreeMap<String, HashMap <String, ArrayList<String>>> country=new TreeMap<>();
		country.put("India", State);
		
		return country;
	}
}
