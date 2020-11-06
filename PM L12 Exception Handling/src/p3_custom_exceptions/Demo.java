package p3_custom_exceptions;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", -1.0);
		System.out.println(s1);
		s1.setGpa(5.0);
		System.out.println(s1);
	}

}
