package p1;

public class Student {
	// instance variables, fields
	private Name name; // default access == package access
	private String id;
	private String phone;
	private double gpa;
	private String major;

	// static variable, class variable
	private static int idCounter = 0;

	// overloaded constructors
	public Student(Name name, String phone, double gpa, String major) {
		super();
		this.name = name;
		this.id = String.valueOf(idCounter++);
		this.phone = phone;
		this.gpa = gpa;
		this.major = major;
	}

	public Student(Name name) {
		super();
		this.name = name;
		this.id = String.valueOf(idCounter++);
	}

	public Student(String firstName, String lastName) {
		this.name = new Name(firstName, lastName);
		this.id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		Student.idCounter = idCounter;
	}

	public String getId() {
		return id;
	}

// id is immutable

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", phone=" + phone + ", gpa=" + gpa + ", major=" + major + "]";
	}

}
