package p1_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextDemo {

	public static void main(String[] args) {
		File file = new File("data/data.txt");
		
			try {
				Scanner scanner = new Scanner(file);
				
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
					
		
	}

}
