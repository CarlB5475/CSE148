package p4_constructors_toString;

public class Student {
	private String name;
	private String phone;
	private double gpa;
	private int age;

	public Student(String name) {
		this.name = name;
	}

	public Student() {
	}

	public Student(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public Student(String name, String phone, double gpa, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.gpa = gpa;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", gpa=" + gpa + ", age=" + age + "]";
	}

	
//	public String toString() {
//		return name + "-----" + phone + "\t" + gpa + "\t" + age;
//	}
}
