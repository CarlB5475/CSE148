package utilities;

import p1.Name;
import p2.Textbook;
import p4.Course;
import p5.Student;
import p6.StudentBag;

public class Utilities {
	
	public static void fillStudentBag(StudentBag theBag, int numberOfStudents) {
		for (int i = 0; i < numberOfStudents; i++) {
			Name studentName = Utilities.emitName();
			Course[] courses = Utilities.emitCourses();
			Student student = new Student(studentName, courses);
			theBag.insert(student);
		}
	}
	
	public static Course[] emitCourses() {
		return null;
	}

	public static Course emitCourse() {
		return null;
	}

	public static Textbook emitTextbook() {
		return null;
	}

	public static Name emitName() {
		String[] firstNames = {"fn1", "fn2", "fn3", "fn4", "fn5", "fn6"};
		String[] lastNames = {"ln1", "ln2", "ln3", "ln4", "ln5", "ln6", "ln7"};
		int randomNumberForFirstName = (int) (Math.random() * firstNames.length);
		int randomNumberForLastName = (int) (Math.random() * lastNames.length);
		return new Name(firstNames[randomNumberForFirstName], lastNames[randomNumberForLastName]);
	}
}
