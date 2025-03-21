import java.util.ArrayList;
import java.util.Scanner;

public class Teams {

	public static void main(String[] args) {
		
		ArrayList<IPL> teams=new ArrayList<>();
		
		IPL i1=new IPL("GT", 16,new char[]{'W','W','L','W','L'});
		IPL i2=new IPL("CSK", 14,new char[]{'W','W','W','L','L'});
		IPL i3=new IPL("MI", 12,new char[]{'W','L','L','W','L'});
		IPL i4=new IPL("LSG", 12,new char[]{'W','L','L','W','L'});
		
		teams.add(i1);
		teams.add(i2);
		teams.add(i3);
		teams.add(i4);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice: ");
		char choice=sc.next().charAt(0);
		
		System.out.println("Enter Input: ");
		int ip=sc.nextInt();
		
		for (int i = 0; i <teams.size(); i++) {
			
			IPL o=teams.get(i);
			int ct=0;
			
			for (int j = 0; j < o.results.length; j++) {
				if (o.results[j]==choice) {
					ct++;
				}
				else if(ct<ip)
				{
				    ct=0;
				}
				else if(ct>=ip)
				{
					break;
				}
			}
			if (ct>=ip) {
				System.out.println(o);
			}
		}
		
	}
	
}
