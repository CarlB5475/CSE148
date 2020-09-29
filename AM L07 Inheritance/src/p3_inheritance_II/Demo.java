package p3_inheritance_II;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Jose", "631-123-4567",3.5, "CSE");
		Student s2 = new Student("John", "516-321-4567",3.5, "MAT");
		Instructor i1 = new Instructor("Joey", "718-345-9876", 10000);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(i1);
	}

}
