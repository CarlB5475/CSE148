package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		// Runtime exceptions, unchecked exceptions
		// unchecked by the compiler
//		int[] numbers = { 1, 2, 3, 4, 5, 6 };
//		System.out.println(numbers[6]);
		
		// checked exceptions have to be handled
		try {
			File file = new File("Data.txt");
			Scanner scanner = new Scanner(file);
			String name = scanner.nextLine();
			System.out.println("The first line is: " + name);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		}
		System.out.println("Done!");
	}

}
