package p4_random_access_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadRandomAccessFileStringDemo {
	
	
	public static void main(String[] args) {
		final int STRING_SIZE = 4;
		try {
			RandomAccessFile randomFile = new RandomAccessFile("data/randomStrs.dat", "r");
			int byteNumber = STRING_SIZE * 1;
			randomFile.seek(byteNumber);
			String str = randomFile.readUTF();
			System.out.println(str);
			
//			byteNumber = STRING_SIZE * 2;
//			randomFile.seek(byteNumber);
//			str = randomFile.readUTF();
//			System.out.println(str);
			randomFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
