package p1_basics;

public class Demo { // main class
	static int i;
	
	public static void main(String[] args) {
		
		// variable scope
		for(i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
		}
		
		System.out.println(i);
		
//		int i = 40;
//		
//		do {
//			System.out.println("Hello World! " + i);
//			i++;
//		} while(i < 20);
		
//		while(i < 20) {
//			System.out.println("Hello World!" + i);
//			i++;
//			
//		}
//		int i = 10;
//		if(i == 5) {
//			System.out.println("Hello");
//		} else if(i > 10) {
//			System.out.println("i is greater than 10.");
//		} else { // catch all
//			System.out.println("Bye");
//		}
		show();
		System.out.println("Done!");
	}
	
	
	public static void show() {
		System.out.println("Hi " + i);
	}

}
