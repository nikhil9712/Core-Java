package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HS1 {
 public static void main(String[] args) {
	
	 HashSet<Integer> hs=new HashSet<>();
	 
	 hs.add(100);
	 hs.add(150);
	 hs.add(299);
	 hs.add(39);
	 hs.add(501);
	 hs.add(100);
	 hs.add(150);
	 hs.add(299);
	 
      System.out.println(hs);
	 
	 HashSet<Integer> hs2=new HashSet<>();
	 
	 hs2.add(190);
	 hs2.add(1480);
	 
	 hs.addAll(hs2);
	 System.out.println(hs2);
	 
	 System.out.println(hs.isEmpty());
	 
	 System.out.println(hs.size());
	 
	 
	
 }
}
