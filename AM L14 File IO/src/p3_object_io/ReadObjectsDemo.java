package p3_object_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjectsDemo {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("data/objectsData.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Student> ss1 = (ArrayList<Student>)ois.readObject();
			System.out.println(ss1);
			
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
