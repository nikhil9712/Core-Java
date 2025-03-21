package Encspdulation;

public class BelowAgeException extends RuntimeException{

	public BelowAgeException() {
		super("You can note vote !!");
	}
}
