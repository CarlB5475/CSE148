package p1;

// before Java 8: all methods in an interface must be abstract
// Starting Java 8, you can have static and default methods inside an interface
// Starting Java 9, you can have private and private static methods
public interface Showable {
	
//	public static final String COLOR = "Red";

	// abstract method
	public void showSpecies();
	
	// static method
	public static void showMySpecies () {
		System.out.println("This is done by the static method in showable interface");
	}
	
	public default void showMySpeciesAgain() {
		System.out.println("This is done from the default method in Showable interface");
	}
	
	private void myPrivateMethod() {
		System.out.println("This is from the private method in Showable interface");
	}
	
	
	private static void myPrivateStaticMethod () {
		System.out.println("This is done by the private static method in showable interface");
	}
	
}
