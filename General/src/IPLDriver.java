import java.util.ArrayList;
import java.util.Scanner;

import ArrayList.AL3;

public class IPLDriver {

	public static void main(String[] args) {
		 
		IPL team1=new IPL("GT", 18, new char[]{'L','L','L','W','W'});
		
		IPL team2=new IPL("MI", 16, new char[]{'L','W','W','W','L'});
		
		IPL team3=new IPL("CKS", 15, new char[]{'L','W','W','L','L'});
		
		IPL team4=new IPL("RR", 14, new char[]{'W','L','L','L','L'});
		
		ArrayList<IPL> a1=new ArrayList<>();
		
		a1.add(team1);
		a1.add(team2);
		a1.add(team3);
		a1.add(team4);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter character: ");
		int character=sc.next().charAt(0);
		
		System.out.println("Enter results: ");
		int desiredresults=sc.nextInt();
		
		ArrayList<IPL> ans=getTeams((char)character,desiredresults, a1);
		
		System.out.println(ans);
		for(IPL t:ans)
		{
			System.out.println(t);
		}
		
	}
	
	public static ArrayList<IPL> getTeams(char result,int count,ArrayList<IPL>a1)
	{
		ArrayList<IPL> ans=new ArrayList<>();
		
		for (int i = 0; i <a1.size(); i++) 
		{   int ct=0;
			IPL t=(IPL)a1.get(i);
			
			for (int j = 0; j <t.result.length; j++) 
			{
				if (t.result[j]==result) 
				{
					ct++;
					if (ct>=count) 
					{
						ans.add(t);
						break;
					}
				} else
				{
                  ct=0;
				}
			}
		}
		return ans;
		
	}
}
