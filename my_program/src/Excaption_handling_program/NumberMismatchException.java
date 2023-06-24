package Excaption_handling_program;

public class NumberMismatchException extends Exception {

	

	public NumberMismatchException(String message) {
		super(message);
	}



	public NumberMismatchException(String message, Throwable cause) {
		super(message, cause);
	}

}
