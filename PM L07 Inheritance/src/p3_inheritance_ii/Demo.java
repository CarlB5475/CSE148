package p3_inheritance_ii;

public class Demo {

	public static void main(String[] args) {
		// one can use variables of the parent class type to reference
		// objects of child class types
		Person s1 = new Student("Jose", "(631)-123-4567", 3.5, "CSE");
		Person s2 = new Student("Maria", "(631)-456-1234", 2.5, "MAT");
		Person i1 = new Instructor("Jose", "(631)-123-4567", 10000);
		Person i2 = new Instructor("Maria", "(631)-456-1234", 20000);
		PersonBagMachine myMachine = new PersonBagMachine(10);
		myMachine.insert(s1);
		myMachine.insert(s2);
		myMachine.insert(i1);
		myMachine.insert(i2);
		
		myMachine.display();
		
//		System.out.println(s1 instanceof Instructor);
//		System.out.println(i1 instanceof Student);
		
		
//		Person[] arr = { s1, s2, i1, i2 };
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] instanceof Student) {
//				System.out.println("Student: " + arr[i].getName());
//			} else {
//				System.out.println("Professor: " + arr[i].getName());
//			}
//		}

//		System.out.println(s1.getName());
//		System.out.println(s1.getName("Mr"));

//		System.out.println(i2.getName());

//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(i1);
//		System.out.println(i2);

	}

}
