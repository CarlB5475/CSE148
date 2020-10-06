package hw4_1;

import java.util.Random;

public class Utilities {
	
	public static Student emitStudent() {
		String[] firstNames = {"f1", "f2", "f3", "f4"};
		String[] lastNames = {"l1", "l2", "l3", "l4" };
		String[] majors ={"CSE", "MAT", "CST", "ENG", "ENS", "SOC"};
		double gpa = (new Random().nextDouble()) * 4;
		String fn = firstNames[new Random().nextInt(firstNames.length)];
		String ln = lastNames[new Random().nextInt(lastNames.length)];
		String major = majors[new Random().nextInt(majors.length)];
		return new Student(new Name(fn, ln), gpa, major);
		
	}
	
	public static Instructor emitInstructor() {
		String[] firstNames = {"f1", "f2", "f3", "f4"};
		String[] lastNames = {"l1", "l2", "l3", "l4" };
		String[] ranks = {"Instructor", "Assistant Professor", "Associate Professor", "Professor"};
		double salary = (new Random().nextDouble()) * 40000;
		String fn = firstNames[new Random().nextInt(firstNames.length)];
		String ln = lastNames[new Random().nextInt(lastNames.length)];
		String rank = ranks[new Random().nextInt(ranks.length)];
		
		return new Instructor(new Name(fn, ln), rank, salary);
	}
}
