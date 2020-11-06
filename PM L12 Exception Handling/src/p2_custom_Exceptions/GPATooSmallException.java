package p2_custom_Exceptions;

public class GPATooSmallException extends Exception {
	public GPATooSmallException() {
		super("GPA Entered is too small!");
	}
}
