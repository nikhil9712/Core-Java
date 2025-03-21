package Hashset;

import java.util.HashSet;

public class LaptopDriver {

	public static void main(String[] args) {
		
		HashSet<Laptop> hs=new HashSet<>();
		hs.add(new Laptop("a", 40000));
		hs.add(new Laptop("b", 74000));
		hs.add(new Laptop("a", 40000));
		hs.add(new Laptop("c", 50500));
		hs.add(new Laptop("dell", 90000));
		hs.add(new Laptop("dell", 90000));
		
		System.out.println(hs);
		/*
		 * [Company: a, Price: 40000 ], 
		 * [Company: dell, Price: 90000 ], 
		 * [Company: c, Price: 50500 ], 
		 * [Company: dell, Price: 90000 ],
		 *  [Company: b, Price: 74000 ]]
		 */
	}
}
