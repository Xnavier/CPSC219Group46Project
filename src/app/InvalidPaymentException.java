package app;

public class InvalidPaymentException extends Exception {
	
	public InvalidPaymentException() {}
	public InvalidPaymentException(String msg) {super(msg);}
	public InvalidPaymentException(Throwable cause) {super(cause);}
	public InvalidPaymentException(String msg, Throwable cause) {
		super(msg, cause);
	}
	public InvalidPaymentException(String msg, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(msg, cause, enableSuppression, writableStackTrace);
	}
}
