package p3_object_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("A", "111");
		Student s2 = new Student("B", "222");
		Student s3 = new Student("C", "333");
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		try {
			FileOutputStream fos = new FileOutputStream("data/StudentObjects.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done writing!");
	}

}
