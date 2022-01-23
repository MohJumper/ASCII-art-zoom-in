
public class NotPerfectSquareException extends Exception{
	
	public NotPerfectSquareException(String errorMessage) {
		super(errorMessage);
		System.out.println(errorMessage);
	}

}
