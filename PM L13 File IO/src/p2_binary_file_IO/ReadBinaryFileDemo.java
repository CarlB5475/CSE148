package p2_binary_file_IO;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryFileDemo {

	public static void main(String[] args) {
		boolean endOfFile = false;
		
		try {
			FileInputStream fis = new FileInputStream("data/binaryOutput.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			while (!endOfFile) {
				try {
					System.out.println(dis.readInt());
				} catch (EOFException e) {
					endOfFile = true;
				}
			}
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
