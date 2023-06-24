package Excaption_handling_program;

public class WrongnumberException extends Exception {

	public WrongnumberException(String message) {
		super(message);
	}


	public WrongnumberException(String message, Throwable cause) {
		super(message, cause);
	}

	

}
