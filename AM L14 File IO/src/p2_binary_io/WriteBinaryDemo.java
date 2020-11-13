package p2_binary_io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("data/data.dat", false);
			DataOutputStream dos = new DataOutputStream(fos);
			for (int i = 0; i < 1000; i++) {
				dos.writeInt(i*2);
			}
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
