package p4_random_access_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteRandomAccessFileDemo {

	public static void main(String[] args) {
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		try {
			RandomAccessFile randomFile = new RandomAccessFile("data/random.dat", "rw");
			for(int i = 0; i < letters.length; i++) {
				randomFile.writeChar(letters[i]);
			}
			randomFile.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
