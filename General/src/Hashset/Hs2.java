package Hashset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class Hs2 {
public static void main(String[] args) {
	
	ArrayList<Integer> al=new ArrayList<>();
	
	al.add(10);
	al.add(26);
	al.add(56);
	al.add(4);
	al.add(91);
	al.add(26);
	
	TreeSet<Integer>ts=new TreeSet<>(al);
	
	System.out.println(al); //[10, 26, 56, 4, 91, 26]
	System.out.println(ts); //[4, 10, 26, 56, 91]
	
	ArrayList<Laptop> al2=new ArrayList<>();
	al2.add(new Laptop("asus",47000));
	al2.add(new Laptop("hp",70000));
	al2.add(new Laptop("lenovo",40000));
	al2.add(new Laptop("acer",38000));
	al2.add(new Laptop("asus",47000));
	
	TreeSet<Laptop>ts1=new TreeSet<>(al2);
	
	System.out.println(al2);
	
	for(Object object :ts1)
	{
		Laptop obj=(Laptop) object;
		System.out.println(obj);
	}
	
	
}
}
