package Numbers;

public class CountOfDigit {

	public static void main(String[] args) {
		
		int num=1254345;
		
		int count=0;
		
		while (num!=0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Count of the givern number is : "+count);
	}
}
