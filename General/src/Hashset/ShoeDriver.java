package Hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ShoeDriver {
public static void main(String[] args) {
	
	HashSet<Shoe> hs1=new HashSet<>();
	
	hs1.add(new Shoe("Para", 1000));
	hs1.add(new Shoe("sparx", 1000));
	hs1.add(new Shoe("nike",2000));
	hs1.add(new Shoe("reebok",3000));
	hs1.add(new Shoe("sparx", 1000));
	hs1.add(new Shoe("Bata",900));
	hs1.add(new Shoe("Bata",900));
	hs1.add(new Shoe("Bata",900));
	hs1.add(new Shoe("Bata",900));
	hs1.add(new Shoe("Bata",900));
	
	System.out.println(hs1.size()); 


	TreeSet<Shoe> ts=new TreeSet<>();
	ts.add(new Shoe("Para", 1000));
	ts.add(new Shoe("sparx", 1000));
	ts.add(new Shoe("nike",2000));
	ts.add(new Shoe("reebok",3000));
	ts.add(new Shoe("sparx", 1000));
	ts.add(new Shoe("Bata",900));
	
	System.out.println(ts);
	
	LinkedHashSet<Shoe> lhs=new LinkedHashSet<>();
	lhs.add(new Shoe("Para", 1000));
	lhs.add(new Shoe("sparx", 1000));
	lhs.add(new Shoe("nike",2000));
	lhs.add(new Shoe("reebok",3000));
	lhs.add(new Shoe("sparx", 1000));
	lhs.add(new Shoe("Bata",900));
	lhs.add(new Shoe("Bata",900));
	lhs.add(new Shoe("Bata",900));
	lhs.add(new Shoe("Bata",900));
	lhs.add(new Shoe("Bata",900));
	
	System.out.println(lhs+" "+lhs.size());
	
}
}
