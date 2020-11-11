package p1_text_IO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextDemo {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		
		
		try {
			FileWriter fw = new FileWriter("data/OutputData.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			for(int i = 0; i < numbers.length; i++) {
				pw.printf("%5d%n", numbers[i]);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done!");
	}

}
