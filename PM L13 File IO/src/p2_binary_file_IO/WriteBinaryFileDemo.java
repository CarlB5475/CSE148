package p2_binary_file_IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFileDemo {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 8, 10, 12, 14};
		
		try {
			FileOutputStream fos = new FileOutputStream("data/binaryOutput.dat", false);
			DataOutputStream dos = new DataOutputStream(fos);
			for(int n : numbers) {
				dos.writeInt(n);
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
