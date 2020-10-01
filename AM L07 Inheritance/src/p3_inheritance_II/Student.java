package p3_inheritance_II;

//subclass
public class Student extends Person {
	private double gpa;
	private String major;
	
	public Student(String name, String phone, double gpa, String major) {
		super(name, phone);
		this.gpa = gpa;
		this.major = major;
	}
	
	// overriding method
	public String getName(String prefix) {
		return "Hi " + prefix + super.getName();
	}
	// overriding method
	public String getName() {
		return "Student " + super.getName();
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

	@Override
	public String toString() {
		return "Student: " + super.toString() + ", gpa=" + gpa + ", major=" + major + "]";
	}

	
}
