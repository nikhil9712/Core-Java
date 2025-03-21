package Encspdulation;

public class Age1 {

	public static void main(String[] args) {
		
		int age=17;
		try
		{
			if(age<18)
			{
				throw new BelowAgeException();
			}
			else
			{
				System.out.println("You can vote !!");
			}
		}
		catch(BelowAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("end !!");
	}
}
