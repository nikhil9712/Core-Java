package Hashset;

import java.util.Objects;

public class Cars {

	
	String company;
	int price;
	
	@Override
	public int hashCode() {
		return Objects.hash(company, price);
	}

	@Override
	public boolean equals(Object o) {
		
		Cars c=(Cars) o;
		
	   if (this.company.equals(c.company) && this.price==c.price) 
	   {
		return true;
	   }
	   return false;
	   }

	public Cars(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Cars [company=" + company + ", price=" + price + "]";
	}
}
