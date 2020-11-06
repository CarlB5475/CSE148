package p3_custom_exceptions;

public class GPATooBigException extends Exception {

	public GPATooBigException() {
		super("GPA Entered is too big!");
	}
}
