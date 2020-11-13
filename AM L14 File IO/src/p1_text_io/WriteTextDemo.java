package p1_text_io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data\\data.txt", false);
			PrintWriter pw = new PrintWriter(fw); // wrapper class
			for(int i = 0; i < 1000; i++) {
				pw.print(i + "\n");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
