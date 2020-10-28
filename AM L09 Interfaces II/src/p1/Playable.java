package p1;

interface Playable { // not concrete
	public final static String OWNER = "Joey";
	
	// (1) abstract methods: all public
	// if you have only one abstract method, this interface is called functional interface (Java 8)
	public void play();
	void rollOver();
	
	// (2) default methods, as many as you like. (Java 8)
	public default String getOwner() { 
		sayBye();
		return OWNER;
	}
	
	// (3) static methods, as many as you like. (Java 8)
	public static void greetings() {
		System.out.println("Hi");
		sayHello();
	}
	
	// (4) private methods, as many as you like (Java 9)
	private void sayBye() {
		System.out.println("Bye");
	}
	
	//  (5) private static methods, as many as you like (Java 9)
	private static void sayHello() {
		System.out.println("Hello");
	}
}
