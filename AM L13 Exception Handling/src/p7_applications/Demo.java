package p7_applications;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Student s1 = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String name = scanner.nextLine();
		System.out.println("Enter student GPA: ");
		double gpa = scanner.nextDouble();
		scanner.nextLine();
		do {
			try {
				s1 = new Student(name, gpa);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("GPA entered is incorrect. Enter a new GPA: ");
				gpa = scanner.nextDouble();
				scanner.nextLine();
			} 
		} while (true);
		
		System.out.println(s1);
	}

}
