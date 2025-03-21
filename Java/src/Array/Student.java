package Array;

import java.util.TreeMap;
import java.util.TreeSet;

public class Student implements Comparable<Student>{

	String name;
	int age;
	public Student()
	{
		
	}
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return("[Name: "+name+"Age: "+age+" ]");
	}
	public int compareTo(Student s)
	{
		Student std=(Student) s;
		if (this.age>std.age) {
			return 1;
		} else if(this.age<std.age)
		{
           return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		TreeSet<Student> ts=new TreeSet<>();
		Student s1=new Student("Nikhil", 23);
		Student s2=new Student("Sarang", 24);
		Student s3=new Student("Ramesh", 58);
		Student s4=new Student("Soham", 10);
		Student s5=new Student("Ajay", 21);
		Student s6=new Student("Vijay", 38);
		
		ts.add(s4);
		ts.add(s3);
		ts.add(s2);
		ts.add(s1);
		ts.add(s5);
		ts.add(s6);
		System.out.println(ts);
		

		TreeMap<String, Integer> hm=new TreeMap<>();
		hm.put("Nikhil", 22);
		hm.put("Sanket", 28);
		hm.put("Ajay", 26);
		hm.put("vijay", 21);
		System.out.println(hm);
	}
	
	
}
