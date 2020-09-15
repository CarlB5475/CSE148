package p2_hw_q2;

public class Demo {
	
	public static void main(String[] args) {
		Student[] arr = new Student[20];
		Student s1 = new Student();
		s1.setName("Jose");
		s1.setPhone("(631)123-4567");
		s1.setGpa(4.0);
		s1.setAge(18);
		
		Student s2 = new Student();
		s2.setName("Alan");
		s2.setPhone("(631)223-1237");
		s2.setGpa(3.0);
		s2.setAge(19);
		
		arr[0] = s1;
		arr[1] = s2;
		
		showStudents(arr, 2); // arguments
		
	}

	private static void showStudents(Student[] a, int n) { // parameters
		for(int i = 0; i < n; i++) {
			String name = a[i].getName();
			String phone = a[i].getPhone();
			double gpa = a[i].getGpa();
			int age = a[i].getAge();
			
			System.out.printf("%-10S%15s%6.2f%5d%n", name, phone, gpa, age);
		}
		
	}

}
