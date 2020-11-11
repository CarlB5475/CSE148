package p1_text_IO;

import java.io.File;

public class TestFileExistenceDemo {

	public static void main(String[] args) {
		File file = new File("MyData.txt");
		System.out.println(file.exists());
	}

}
