package p2_custom_Exceptions;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) throws GPATooBigException, GPATooSmallException {
		super();
		if (gpa > 4.0) {
			throw new GPATooBigException();
		} else if (gpa < 0.0) {
			throw new GPATooSmallException();
		} else {
			this.name = name;
			this.gpa = gpa;
		}
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

	public void setGpa(double gpa) throws GPATooBigException, GPATooSmallException {
		if (gpa > 4.0) {
			throw new GPATooBigException();
		} else if (gpa < 0.0) {
			throw new GPATooSmallException();
		} else {
			this.gpa = gpa;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
