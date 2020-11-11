package p6_checked_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		File file = new File("data/data.txt");
		String line = "";
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				line += scanner.nextLine() + ", ";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		System.out.println(line);
		System.out.println("End");
	}

}
