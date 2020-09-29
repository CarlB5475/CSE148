package p2_inheritance_I;

public class Student {
	private String name;
	private String id;
	private String phone;
	private double gpa;
	private String major;

	private static int idCounter = 0;

	public Student(String name, String phone, double gpa, String major) {
		super();
		this.name = name;
		this.phone = phone;
		this.gpa = gpa;
		this.major = major;
		this.id = String.valueOf(idCounter++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", phone=" + phone + ", gpa=" + gpa + ", major=" + major + "]";
	}

}
