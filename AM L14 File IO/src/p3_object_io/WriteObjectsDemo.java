package p3_object_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObjectsDemo {

	public static void main(String[] args) {
		Student s1 = new Student("A", "111");
		Student s2 = new Student("B", "222");
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
		try {
			FileOutputStream fos = new FileOutputStream("data/objectsData.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
