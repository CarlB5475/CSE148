package p2_custom_Exceptions;

public class GPATooBigException extends Exception {

	public GPATooBigException() {
		super("GPA Entered is too big!");
	}
}
