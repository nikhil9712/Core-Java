package ArrayList;
import java.sql.Array;
import java.util.ArrayList;
public class Newspaper1
{   
	String name;
	int[]price;
	
	public Newspaper1 (String name,int[]price)
	{
		this.name=name;
		this.price=price;
	}
	
	public String toString()
	{
		return("[Name: "+name+" ]");
	}
	public static void main(String[] args)
	{
		String name;
	    //Way1 to Initialise Arrays !!
		int[]cost=new int[4];
		cost[0]=10;
		cost[1]=20;
		cost[2]=30;
		cost[3]=40;
		System.out.println(cost[0]);
		System.out.println(cost[1]);
		System.out.println(cost[2]);
		System.out.println(cost[3]);
		System.out.println("**************");
		//Way2 to Initialise Arrays !!
		int[]cost1= {10,20,30,40};
		System.out.println(cost1[0]);
		System.out.println(cost1[1]);
		System.out.println(cost1[2]);
		System.out.println(cost1[3]);
		System.out.println("**************");
		//Way3 to Initialise Arrays !!
		int[]cost2=new int[] {10,20,30,40};
		System.out.println(cost2[0]);
		System.out.println(cost2[1]);
		System.out.println(cost2[2]);
		System.out.println(cost2[3]);
		System.out.println("**************");
		
		
		Newspaper1 n1=new Newspaper1("The Hindu", new int[]{1,2,3,4});
		Newspaper1 n2=new Newspaper1("Lokmat", new int[]{2,4,6,8});
		Newspaper1 n3=new Newspaper1("Sakal", new int[]{3,6,9,12});
		Newspaper1 n4=new Newspaper1("TOI", new int[]{4,8,12,16});
		
		System.out.println(n1.name);
		System.out.println(n1.price[0]);
		System.out.println(n1.price[1]);
		System.out.println(n1.price[2]);
		System.out.println(n1.price[3]);
		
		ArrayList papers=new ArrayList<>();
		papers.add(n1);
		papers.add(n2);
		papers.add(n3);
		papers.add(n4);
		
		System.out.println(papers.get(0));
		System.out.println(n1);
		
		 
		
	/*	System.out.println(papers.get(0));
		System.out.println(papers.get(1));
		System.out.println(papers.get(2));
		System.out.println(papers.get(3));
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		papers.add(new Newspaper1("The Economics", new int[] {5,10,15,20}));
		papers.add(new Newspaper1("Gujrat Samachar", new int[] {6,12,18,24}));
		System.out.println(papers.get(4));
		System.out.println(papers.get(5));
		
		System.out.println(  );
		
		System.out.println(papers.get(0));
		*/
		
		
		Newspaper1 obj=(Newspaper1)papers.get(0);
		System.out.println(obj);
		System.out.println(n1);
		
		System.out.println(n1.equals(obj));
		
	}
}
