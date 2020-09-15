package p4_constructors_toString;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Jose", "631-123-4567", 3.5, 20);
		Student s2 = new Student("Josie", "631-321-4567", 2.5, 19);
		Student s3 = new Student("John", "631-923-4567", 2.5, 18);
		Student s4 = new Student("Jane", "646-123-4567", 1.5, 20);
		
		Student s5 = new Student();
		Student s6 = new Student("John");
		
		System.out.println(s1);
	}

}
