package Excaption_handling_program;

public class NagetiveAgeException extends Exception {
	
	public NagetiveAgeException(String message) {
		super(message);
	}

	public NagetiveAgeException(String message, Throwable cause) {
		super(message, cause);

	}


}
