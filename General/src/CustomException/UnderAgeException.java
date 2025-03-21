package CustomException;

public class UnderAgeException extends RuntimeException{

	UnderAgeException()
	{
		super("You can note vote");
	}
	UnderAgeException(String msg)
	{
		super(msg);
	}
}
