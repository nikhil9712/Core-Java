package Hashset;

import java.util.HashSet;

public class MobileDriver 
{
   public static void main(String[] args) {
	   
	 
	   HashSet<Mobile> hs=new HashSet<>();
	   hs.add(new Mobile("oppo",10000));
	   hs.add(new Mobile("oppo",10000));
	   hs.add(new Mobile("vivo",15000));
	   hs.add(new Mobile("realme",20000));
	   hs.add(new Mobile("iphone",100000));
	   hs.add(new Mobile("iphone",100000));
	   
	   System.out.println(hs);
}
   
}
