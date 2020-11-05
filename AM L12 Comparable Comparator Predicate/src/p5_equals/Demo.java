package p5_equals;

public class Demo {

	public static void main(String[] args) {
		Book b1 = new Book("A", "111", 9.99);
		Book b2 = new Book("B", "111", 9.99);
		
		// == and .equals() both compare memory addresses
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2)); // compare contents
//		
//		// == and .equals() both compare memory addresses
//		System.out.println(b1 == b2); // compare memory addresses
//		System.out.println(b1.equals(b2)); // compare contents after overriding hashCode and equals methods
	}

}
