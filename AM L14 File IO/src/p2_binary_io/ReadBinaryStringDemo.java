package p2_binary_io;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryStringDemo {

	public static void main(String[] args) {
		boolean endOfFile = false;
		
		try {
			FileInputStream fis = new FileInputStream("data/stringData.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			while(!endOfFile) {
				try {
					String str = dis.readUTF();
					System.out.println(str);
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
