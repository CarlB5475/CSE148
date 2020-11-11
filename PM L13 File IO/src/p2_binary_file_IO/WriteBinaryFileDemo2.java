package p2_binary_file_IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFileDemo2 {

	public static void main(String[] args) {
		String[] letters = {"A", "B", "C", "D", "E", "F", "G"};
		
		try {
			FileOutputStream fos = new FileOutputStream("data/binaryOutputString.dat", false);
			DataOutputStream dos = new DataOutputStream(fos);
			for(String n : letters) {
				dos.writeUTF(n);
				System.out.println(n);
			}
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
