package p1_text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadTextDemo {

	public static void main(String[] args) {
		ArrayList<String> firstNameList = new ArrayList<>();
		ArrayList<String> lastNameList = new ArrayList<>();
		
		Scanner scanner = null;
		try {
		
			File file = new File("data\\data.txt");
			if(file.exists()) {
			
				
			scanner = new Scanner(file);
			
			}
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] names = line.split(",");
				firstNameList.add(names[0]);
				lastNameList.add(names[1].trim());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(firstNameList);
		System.out.println(lastNameList);
		
	}

}
