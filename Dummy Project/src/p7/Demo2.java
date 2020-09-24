package p7;

import p1.Name;
import p2.Textbook;
import p4.Course;
import p5.Student;
import p6.StudentBag;
import utilities.Utilities;

public class Demo2 {

	public static void main(String[] args) {
		int maxBagSize = 200000;
		int numberOfStudents = 5000;
		StudentBag theBag = new StudentBag(maxBagSize);
		Utilities.fillStudentBag(theBag, numberOfStudents);
		theBag.display();
	}

	
}
