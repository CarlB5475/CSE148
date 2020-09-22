package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Al", 2.0);
		Student s2 = s1; // shallow copy
		
		s1.setName("B");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		
		//--------------------------------
		
		Student s3 = new Student(s1.getName(), s1.getGpa()); // deep copy
		System.out.println(s1 == s3);
		
		s1.setName("Jim");
		System.out.println(s1);
		System.out.println(s3);
	}

}
