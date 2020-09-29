package p3_inheritance_ii;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Jose", "(631)-123-4567", 3.5, "CSE");
		Student s2 = new Student("Maria", "(631)-456-1234", 2.5, "MAT");
		Instructor i1 = new Instructor("Jose", "(631)-123-4567", 10000);
		Instructor i2 = new Instructor("Maria", "(631)-456-1234", 20000);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(i1);
		System.out.println(i2);
		
	}

}
