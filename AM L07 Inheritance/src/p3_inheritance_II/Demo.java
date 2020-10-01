package p3_inheritance_II;

public class Demo {

	public static void main(String[] args) {
//		Person p1 = new Person("Clark", "631-987-4567");
		// superclass variable types can reference objects of subclass types
		// That is polymorphism
		Person p1 = new Student("Jose", "631-123-4567",3.5, "CSE");
		Person p2 = new Student("John", "516-321-4567",3.5, "MAT");
		Person p3 = new Instructor("Joey", "718-345-9876", 10000);
		Person[] arr = {p1, p2, p3};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student) {
				System.out.println(((Student) arr[i]).getGpa());
			} else {
				System.out.println(((Instructor) arr[i]).getSalary());
			} 
		}
		
		
//		PersonBag theBag = new PersonBag(10);
//		theBag.insert(s1);
//		theBag.insert(s2);
//		theBag.insert(i1);
//		
//		theBag.display();
		
//		Person[] arr = {s1, s2, i1};
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	
//		System.out.println(s1.getName());
//		System.out.println(i1.getName());
		
		
//		System.out.println(s1.getName("Mr."));
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(i1);
//		System.out.println(p1);
	}

}
