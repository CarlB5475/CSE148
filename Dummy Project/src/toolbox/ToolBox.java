package toolbox;

import p1.Name;
import p2.Textbook;
import p4.Course;
import p5.Student;
import p6.StudentBag;

public class ToolBox {

	private static Course emitCourse() {
		return null;
	}

	private static Textbook emitTextbook() {
		return null;
	}

	private static Name emitName() {
		String[] firstNameArr = { "fn1", "fn2", "fn3", "fn4", "fn5", "fn6", "fn7" };
		String[] lastNameArr = { "ln1", "ln2", "ln3", "ln4", "ln5", "ln6", "ln7", "ln8", "ln9" };
		int randNumberFirstName = (int) (Math.random() * firstNameArr.length);
		int randNumberLastName = (int) (Math.random() * lastNameArr.length);
		return new Name(firstNameArr[randNumberFirstName], lastNameArr[randNumberLastName]);
	}

	public static void fillBagWithStudent(StudentBag theBag) {
		// create and insert one student
		Name name = ToolBox.emitName();
		Course[] courses = new Course[4];
		Course c1 = ToolBox.emitCourse();
		courses[0] = c1;
		Student student = new Student(name, courses);
		theBag.insert(student);

	}

}
