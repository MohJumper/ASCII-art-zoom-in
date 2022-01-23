package exceptions;


public class FileNotFoundException extends Exception {
	
	public FileNotFoundException(String errorMessage) {
		super(errorMessage);
		System.out.println(errorMessage);
	}

}
