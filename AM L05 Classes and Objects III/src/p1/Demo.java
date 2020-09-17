package p1;

public class Demo {

	public static void main(String[] args) {
		Name name = new Name("Jose", "Fernandez");
		Student s1 = new Student(name);
		Student s2 = new Student("John", "Doe");
		Student s3 = new Student(new Name("Jane", "Doe"), "631-123-4567", 0.0, "CS");
		Student s4 = new Student("Joey", "Smith");
		
		StudentBag theBag = new StudentBag(100);
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.insert(s4);
		theBag.display();
		
		Student studentDeleted = theBag.deleteById("2");
		System.out.println(studentDeleted);
		
		theBag.display();
	}

}
