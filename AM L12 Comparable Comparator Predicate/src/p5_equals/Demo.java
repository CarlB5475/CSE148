package p5_equals;

public class Demo {

	public static void main(String[] args) {
		Book b1 = new Book("A", "111", 9.99);
		Book b2 = new Book("B", "222", 9.99);
		
		// == and .equals() both compare memory addresses
		System.out.println(b1 == b2); // compare memory addresses
		System.out.println(b1.equals(b2)); // compare contents after overriding hashCode and equals methods
	}

}
