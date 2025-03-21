package ArrayList;

public class Boys implements Comparable<Boys>{

	String name;
	int age;
	@Override
	public String toString() {
		return "Boys [name=" + name + ", age=" + age + "]";
	}
	public Boys(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//	public boolean equals(Object o)
//	{
//		Boys b=(Boys) o;
//		if (this.age==b.age) {
//			return true;
//		} else {
//            return false;
//		}
//	}
	
	public int compareTo(Boys b)
	{
		if (this.age>b.age) 
		{
			return 1;
		}
		else if(this.age<b.age) {
         return -1;
         
		}
		return 0;
	}
	
}
