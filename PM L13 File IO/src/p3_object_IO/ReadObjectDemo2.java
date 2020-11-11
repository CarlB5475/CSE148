package p3_object_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjectDemo2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data/StudentObjects.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s1 = (Student) ois.readObject();
			Student s2 = (Student) ois.readObject();
			System.out.println(s1);
			System.out.println(s2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
