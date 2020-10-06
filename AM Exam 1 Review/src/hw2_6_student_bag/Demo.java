package hw2_6_student_bag;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(4);
		Student s1 = new Student(new Name("FA", "LA"), 4.0, "CSE");
		Student s2 = new Student(new Name("FB", "LB"), 3.0, "MAT");
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert("FC", "LC", "ENG", 2.5);
		
		theBag.display();
		theBag.removeById("1");
		System.out.println("After removal: ");
		theBag.display();
	}

}
