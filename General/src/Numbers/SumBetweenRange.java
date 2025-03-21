package Numbers;

public class SumBetweenRange {

	public static void main(String[] args) {
		
		int start=1;
		
		int end=10;
		
		int sum=0;
		
		for (int i = start; i < end; i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum between the range is  "+sum);
	}
}
