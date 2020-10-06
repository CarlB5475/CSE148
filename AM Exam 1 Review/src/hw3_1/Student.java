package hw3_1;

public class Student {
	private Name name;
	private String id;
	private double gpa;
	private String major;
	
	private static int idCounter = 0;
	
	public Student(Name name, double gpa, String major) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.major = major;
		this.id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + ", major=" + major + "]";
	}
	
	
}
