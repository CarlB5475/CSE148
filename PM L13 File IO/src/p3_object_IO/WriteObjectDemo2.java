package p3_object_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObjectDemo2 {

	public static void main(String[] args) {
		Student s1 = new Student("A", "111");
		Student s2 = new Student("B", "222");
		try {
			FileOutputStream fos = new FileOutputStream("data/StudentObjects.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done writing!");
	}

}
