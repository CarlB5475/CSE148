package p1_variables;

public class Demo {

	public static void main(String[] args) {
		// a variable is a memory location used to store data
		// primitive variable:
		int i = 10; // 4 bytes to store an integer
		int j = i;
		double d = 2.5; // 8 bytes
		short s = 5;  // 2 bytes
		long l = 10;  // 8 bytes
		float f = 3.5f; // 4 bytes
		boolean b = true; // 1 byte
		char c = 'a'; // 2 bytes unicode
		
		// reference variable
		String n = "Joe";
		String m = n;
		System.out.println(n);
		System.out.println(m);
	}

}
