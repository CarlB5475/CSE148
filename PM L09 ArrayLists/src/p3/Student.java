package p3;

public class Student implements Comparable<Student> {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
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
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(this.gpa, o.gpa);
	}

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

}
