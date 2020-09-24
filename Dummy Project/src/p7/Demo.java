package p7;

import p1.Name;
import p2.Textbook;

public class Demo {
	
	public static String createName() {
		String name = "";
		for (int i = 0; i < (int)(Math.random() * 10); i++) {
			name += ((char)(65 + (int) (Math.random() * 26)));
		}
		return name;
	}
	/*
	 * Hexadecimal number system:
	 * 0 - 9, a - f
	 * a: 10, b: 11, c:12, d:13, e:14, f:15
	 * 
	 * 0x3a --> 111010 -> 2 + 8 + 16 + 32 n= 58
	 * f -> 1111 ->15
	 * @5305068a -> 0101 0011 0000 0101 0000 0110 1000 1010 --> 32 bits --> 4 bytes
	 * hashcode of the memory address
	 */ 

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(createName());
		}
		
		Textbook b1 = new Textbook("Java", "123434", new Name("John", "Doe"), 29.99);
		System.out.println(b1);
		b1.setPrice(49.99);
		System.out.println(b1);
		System.out.println();
		Textbook b2 = new Textbook("HTML", "54321");
		b2.setAuthorAndPrice("Jane", "Doe", 99.99);
		System.out.println(b2);
		
		
//		StudentBag theBag = new StudentBag(100);
//		
//		Course[] coursesForS1 = new Courses[4];
//		coursesForS1[0] = new Course();
//		coursesForS1[1] = new Course();
//		coursesForS1[2] = new Course();
//		Name n = new Name("Jose", "Fernandez");
//		Student s1 = new Student("jose", "Fernandez", CoursesForS1);
//		
//		Course[] coursesForS2 = new Courses[4];
//		coursesForS1[0] = new Course("CSE110");
//		coursesForS1[1] = new Course("CSE148", "OOP",);
//		coursesForS1[2] = new Course();
//		coursesForS1[3] = new Course();
//		Student s2 = new Student("jose", "Fernandez", CoursesForS2);
//		theBag.insert(s1);
//		

//		Name name = new Name("A", "B");
//		Course[] courses = {new Course(); new Course(), new Course()}
//		Student s1 = new Student("Jose", )

//		for (Integer i : list) {
//			System.out.println(i);
//		}
	}
}
