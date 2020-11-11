package p8_custom_exception_classes;

import java.util.Scanner;

public class Student {
	private String name;
	private double gpa;
	
	Scanner scanner = new Scanner(System.in);

	public Student(String name, double gpa)  {
		super();
		this.name = name;
		do {
			if (gpa > 4.0 || gpa < 0.0) {
				try {
					throw new IncorrectGPAException("Wrong GPA!");
					
				} catch (IncorrectGPAException e) {
					System.out.println("Enter a new GPA: ");
					gpa = scanner.nextDouble();
				}
			} else {
				break;
			}
		} while (true);
		
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

}
