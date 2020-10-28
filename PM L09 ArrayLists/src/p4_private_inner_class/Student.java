package p4_private_inner_class;

public class Student implements Comparable<Student> {
	private String name;
	private double gpa;
	private int age;

	public Student(String name, double gpa, int age) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}

	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa +  ", Age=" + age +"]";
	}


	@Override
	public int compareTo(Student o) {
		return (this.age - o.age);
	}

//	@Override
//	public int compareTo(Object o) {
//		return this.name.compareTo(((Student)o).name);
//	}

//	@Override
//	public int compareTo(Student o) {
//		return -Double.compare(this.gpa, o.gpa);
//	}

//	@Override
//	public int compareTo(Student o) {
//		if (this.name.compareTo(o.name) == 0) {
//			return 0;
//		} else if(this.name.compareTo(o.name) > 0) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	
//	@Override
//	public int compareTo(Student s) {
//		return this.name.compareTo(s.name);
//	}

}
