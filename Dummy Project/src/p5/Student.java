package p5;

import java.util.Arrays;

import p1.Name;
import p4.Course;

public class Student {
	private Name name;
	private String id;
	private Course[] courses;
	private static int idCounter = 0;

	public Student(Name name, Course[] courses) {
		super();
		this.name = name;
		this.id = String.valueOf(idCounter++);
		this.courses = courses;
	}
	
	
	public Student(String fn, String ln) {
		super();
		this.name = new Name(fn, ln);
		this.id = String.valueOf(idCounter++);
		this.courses = courses;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", courses=" + Arrays.toString(courses) + "]";
	}
	
	

}
