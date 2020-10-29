package p1_review;

public interface Doable {
	// before Java 8, all methods are abstract
	void doThis();
	void doThat();
	
	// from Java 8 on: you can have non-abstract methods
	// (1) default methods
	public default void doDefault() {
		System.out.println("Default Method!");
		doPrivate();
	}
	
	// (2) static methods
	public static void doStatic() {
		System.out.println("Static Method!");
		doPrivateStatic();
	}
	
	// Java 8 introduced a special type of interface called functional interface
	// which is an interface with only ONE abstract method
	
	// From Java 9 on: you can have private and private static methods, those
	// are not abstract
	// (3) private method
	private void doPrivate() {
		System.out.println("Private Method");
	}
	
	// (4) private static method
	private static void doPrivateStatic() {
		System.out.println("Private Static Method");
	}
}
