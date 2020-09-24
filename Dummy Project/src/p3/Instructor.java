package p3;

import p1.Name;

public class Instructor {
	private Name name;
	private String id;
	private String rank;
	private double salary;
	private String officeNumber;

	private static int idCounter = 0;

	public Instructor(Name name, String rank, double salary, String officeNumber) {
		super();
		this.name = name;
		this.rank = rank;
		this.salary = salary;
		this.officeNumber = officeNumber;
		this.id = String.valueOf(idCounter++);
//		this.id = String.valueOf((int)(Math.random() * 1000));
	}

	public Instructor(Name name) {
		super();
		this.name = name;
		this.id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", id=" + id + ", rank=" + rank + ", salary=" + salary + ", officeNumber="
				+ officeNumber + "]";
	}

}
