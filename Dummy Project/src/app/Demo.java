package app;

import p1.Name;
import p2.Textbook;
import p4.Course;
import p5.Student;
import p6.StudentBag;
import toolbox.ToolBox;

public class Demo {

	public static void main(String[] args) {
		final int MAX_BAG_SIZE = 2000;
		final int NUMBER_OF_STUDENTS_TO_INSERT = 5;
		StudentBag theBag = new StudentBag(MAX_BAG_SIZE);
		
		for (int i = 0; i < NUMBER_OF_STUDENTS_TO_INSERT; i++) {
			ToolBox.fillBagWithStudent(theBag);
		}
		theBag.display();
	}

	

}
