package p1_basics;

public class Demo {
	public static int i = 100;
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 7, 9, 11};
		for(int number : numbers) {  // for-each loop
			System.out.print(number * 2 + " ");
		}
		
		
//		int a = 10;
//		// scope
//		int i;
//		for(i = 0; i < a; i++) {
//			System.out.println(i);
//		}
//		System.out.println(i);
//		show();
		
//		while(a == 5) { // check first
//			System.out.println("Hi");
//		}
//		
//		do { // do first, check later
//			System.out.println("Bye");
//		} while(a == 10);
//		
//		
//		System.out.println("Done");
		
//		int a = 3;
//		if(a == 10) {
//			System.out.println("hi");
//		} else if(a > 5) {
//			System.out.println("Bye");
//		} else { // catch all
//			System.out.println("not hi not bye");
//		}
//		System.out.println("Done!");
	}
	
	public static void show() {
		System.out.println(i * i);
	}

}
