package Hashset;
import java.util.ArrayList;  
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Hs1 {
public static void main(String[] args) {
	
	ArrayList<String> s1=new ArrayList<>();
	
	s1.add("sql");
	s1.add("java");
	s1.add("webtech");
	s1.add("java");
	s1.add("manual");
	
	
	System.out.println(s1);  //[sql, java, webtech, java, manual] 
	
	/* Repeted values
	 * Having Index
	 * Added acocording to order of insertion
	 */
	
	HashSet<String> hs=new HashSet<>();
	hs.addAll(s1);
	System.out.println(hs);  //[webtech, java, manual, sql]
	
       
	/* No repeted values (Removed Duplicates)
	 * No indexing
	 * randomly printed no order of insertion 
	 */
	
	//System.out.println(s1.getClass()); //class java.util.ArrayList

	//System.out.println(hs.getClass());  //class java.util.HashSet 
	
	/*Print the class name of object 
	 * and tells type of object that to which class does it depends
	 */
	
	LinkedHashSet<String> ls=new LinkedHashSet<>();
	ls.add("Dell"); 
	ls.add("Dell"); 
	ls.add("HP");   
	ls.add("Apple");   
	ls.add("Acer");   
	ls.add("Asus");  
	ls.add("ACB");
	ls.add("acb");
	
	System.out.println(ls); //Dell, HP, Apple, Acer, Asus, ACB, acb
	/*
	 * No repeted values 
	 * do not follow indexing
	 * but follow order of insertion
	 */
	
	
	TreeSet<String> ts= new TreeSet<String>();   
	//adding elements to TreeSet  
	ts.add("Dell"); 
	ts.add("Dell"); 
	ts.add("HP");   
	ts.add("Apple");   
	ts.add("Acer");   
	ts.add("Asus");  
	ts.add("ACB");
	ts.add("acb");
	
	
	System.out.println(ts); //ACB, Acer, Apple, Asus, Dell, HP, acb]
	
	/*
	 * No repeted values 
	 * follow indexing
	 * but follow order of insertion
	 */
	
	
	
}
}
