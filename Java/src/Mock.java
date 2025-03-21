
public class Mock {

	public static void fizBuzz(int n)
	{
		for (int i = 1; i <=n; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("FizBuzz");
			} else if(i%3==0)
			{
               System.out.println("Fiz");
			}
			else if(i%5==0)
			{
               System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		fizBuzz(15);
	}
}
