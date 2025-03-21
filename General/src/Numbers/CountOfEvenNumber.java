package Numbers;

public class CountOfEvenNumber {

	public static void main(String[] args) {
		
		int start=1;
		int end=100;
		
		int count=0;
		
		for (int i = start; i <= end; i++)
		{
			if (i%2==0) 
			{
				count++;
			}
		}
		System.out.println("Total Even Numbers in given range is: "+count);
	}
}
