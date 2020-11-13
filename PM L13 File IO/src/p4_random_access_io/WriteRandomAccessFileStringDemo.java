package p4_random_access_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteRandomAccessFileStringDemo {

	public static void main(String[] args) {
		String[] strs = {"AA", "AA"}; //, "BBBB", "Cc", "Dddd", "Eee", "F", "G", "H", "I"};
		
		try {
			RandomAccessFile randomFile = new RandomAccessFile("data/randomStrs.dat", "rw");
			for(int i = 0; i < strs.length; i++) {
				randomFile.writeUTF(strs[i]);
			}
			randomFile.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
