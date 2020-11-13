package p4_random_access_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteRandomAccessFileIntDemo {

	public static void main(String[] args) {
		int[] numbers = {10, 100, 1000, 10000, 100000, 20, 30, 40, 50};
		
		try {
			RandomAccessFile randomFile = new RandomAccessFile("data/randomInt.dat", "rw");
			for(int i = 0; i < numbers.length; i++) {
				randomFile.writeInt(numbers[i]);
			}
			randomFile.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
