package p2_inheritance;

public class Instructor {
	private String name;
	private String id;
	private String phone;
	private double salary;

	private static int idCounter = 0;

	public Instructor(String name, String phone, double salary) {
		super();
		this.name = name;
		this.phone = phone;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", id=" + id + ", phone=" + phone + ", salary=" + salary + "]";
	}

}
