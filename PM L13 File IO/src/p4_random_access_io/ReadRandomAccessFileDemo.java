package p4_random_access_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadRandomAccessFileDemo {
	
	
	public static void main(String[] args) {
		final int CHAR_SIZE = 2;
		try {
			RandomAccessFile randomFile = new RandomAccessFile("data/random.dat", "r");
			int byteNumber = CHAR_SIZE * 4;
			randomFile.seek(byteNumber);
			char ch = randomFile.readChar();
			System.out.println(ch);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
