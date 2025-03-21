package Encspdulation;

public class Age {

	public static void main(String[] args) throws UnderAgeException{
		
		int age=17;
		if (age>=18) {
			System.out.println("You can vote");
		}
		else if(age<18)
		{
			throw new UnderAgeException();
		}
		System.out.println("hello");

	}
}
