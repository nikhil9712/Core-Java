package Hashset;

public class Shoe implements Comparable<Shoe>{
String name;
int price;


public Shoe() {
	// TODO Auto-generated constructor stub
}

Shoe(String name,int price)
{
 this.name=name;
 this.price=price;
}

public String toString()
{
  return "[ Name: "+name+", Price: "+price+" ]";

}

@Override
public boolean equals(Object o)
{
  Shoe s=(Shoe) o;
  
  if (this.name.equals(s.name) && this.price==s.price) 
  {
	return true;
  }
  return false;
}


public int hashCode()
{
int hc=name.hashCode()+price;
return hc;
}

public int compareTo(Shoe s)
{
	if (this.price>s.price) {
		return 1;
	}
	else if(this.price<s.price) 
	{
     return -1;
	}
	return 0;
}

}