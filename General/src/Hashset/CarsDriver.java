package Hashset;

import java.util.HashSet;

public class CarsDriver {

	public static void main(String[] args) {
		
		HashSet<Cars> hs=new HashSet<>();
		
		Cars c1=new Cars("Tata",500);
		Cars c2=new Cars("Maruti",700);
		Cars c5=new Cars("Maruti",700);
		Cars c3=new Cars("Mahindra",900);
		Cars c4=new Cars("Tata",500);
		
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		
		System.out.println(hs.size());
		System.out.println(hs);
	}
}
