package Excaption_handling_program;

public class OutOFAgeException extends Exception {


	public OutOFAgeException(String message) {
		super(message);
	}


	public OutOFAgeException(String message, Throwable cause) {
		super(message, cause);
	}

}
