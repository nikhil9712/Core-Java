package Abstraction;

import java.util.HashSet;
import Hashset.Mobile;

public class Mobile1Driver {

	   public static void main(String[] args) {
		   
		   Mobile M6=new Mobile("oppo",10000);
		   Mobile M1=new Mobile("oppo",10000);
		   Mobile M2=new Mobile("vivo",15000);
		   Mobile M3=new Mobile("realme",20000);
		   Mobile M4=new Mobile("iphone",100000);
		   Mobile M5=new Mobile("oneplus",55000);
		   
		   HashSet<Mobile> hs=new HashSet<>();
		   hs.add(M5);
		   hs.add(M4);
		   hs.add(M3);
		   hs.add(M2);
		   hs.add(M1);
		   hs.add(M6);
		   
		   System.out.println(hs);
	   }
}
