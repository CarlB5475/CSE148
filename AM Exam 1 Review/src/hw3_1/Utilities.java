package hw3_1;

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
}
