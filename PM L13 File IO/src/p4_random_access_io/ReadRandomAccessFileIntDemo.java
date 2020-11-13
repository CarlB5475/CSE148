package p4_random_access_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadRandomAccessFileIntDemo {
	
	
	public static void main(String[] args) {
		final int INTEGER_SIZE = 4;
		try {
			RandomAccessFile randomFile = new RandomAccessFile("data/randomInt.dat", "r");
			int byteNumber = INTEGER_SIZE * 1;
			randomFile.seek(byteNumber);
			int n = randomFile.readInt();
			System.out.println(n);
			
			byteNumber = INTEGER_SIZE * 2;
			randomFile.seek(byteNumber);
			n = randomFile.readInt();
			System.out.println(n);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
