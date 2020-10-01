package p3_inheritance_II;

public class Instructor extends Person {
	private double salary;

	public Instructor(String name, String phone, double salary) {
		super(name, phone);
		this.salary = salary;
	}

	// Overriding method
	public String getName() {
		return "Professor " + super.getName();
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Instructor: " + super.toString() + ", salary=" + salary + "]";
	}

}
