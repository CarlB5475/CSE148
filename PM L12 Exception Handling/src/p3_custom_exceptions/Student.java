package p3_custom_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		try {
			if (gpa > 4.0) {
				throw new GPATooBigException();
			} else if (gpa < 0.0) {
				throw new GPATooSmallException();
			} else {
				this.name = name;
				this.gpa = gpa;
			}
		} catch (GPATooBigException e) {
			this.name = name;
			this.gpa = 4.0;
		} catch (GPATooSmallException e) {
			this.name = name;
			this.gpa = 0.0;
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

	public void setGpa(double gpa) {
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				if (gpa > 4.0) {
					throw new GPATooBigException();
				} else if (gpa < 0.0) {
					throw new GPATooSmallException();
				} else {
					this.gpa = gpa;
					break;
				}
			} catch (GPATooBigException e) {
				System.out.println("GPA entered is too big. Enter a new one: ");
				try {
					gpa = scanner.nextDouble();
				} catch (InputMismatchException e1) {
					System.out.println("GPA has to be a double.");
				}
			} catch (GPATooSmallException e) {
				System.out.println("GPA entered is too small. Enter a new one: ");
				try {
					gpa = scanner.nextDouble();
				} catch (InputMismatchException e1) {
					System.out.println("GPA has to be a double.");
				}
			} 
		} while (true);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
