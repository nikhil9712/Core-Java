
public class ChargerDriver {

	public static void main(String[] args) {
		
		Charger s1=new Charger(100,"Iphone","C");
		
		Charger s2=new Charger(200,"Oppo","USB");
		
		Charger s3=new Charger(100,"Iphone","C");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println("****************");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println("****************");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		System.out.println("****************");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("****************");
	}
}
