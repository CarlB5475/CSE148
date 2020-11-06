package p3_custom_exceptions;

public class GPATooSmallException extends Exception {
	public GPATooSmallException() {
		super("GPA Entered is too small!");
	}
}
