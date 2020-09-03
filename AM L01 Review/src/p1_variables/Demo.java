package p1_variables;

public class Demo {

	public static void main(String[] args) {
		//Two types of variables
		// Type 1: primitive variables
		int i = 10; // 4 bytes long
		double d = 2.5; // 8 bytes
		short s = 3; // 2 bytes
		long l = 3; // 8 bytes
		float f = 3.5f; // 4 bytes
		char c = '4'; // 2 bytes
		boolean b = true; //1 byte
		
		System.out.println(Integer.MIN_VALUE + " --- " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " --- " + Long.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + " --- " + Double.MAX_VALUE) ;
		System.out.println(Float.MIN_VALUE + " --- " + Float.MAX_VALUE);
		
		// Type 2: reference variables
		String n = "Joe";
		n = "Al";
		System.out.println(n);
	}

}
