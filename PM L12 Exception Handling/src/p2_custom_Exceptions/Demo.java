package p2_custom_Exceptions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		Student s1;
		String name = "A";
		double gpa = 4.5;
		
		do {
			try {
				s1 = new Student(name, gpa);
				break;
			} catch (GPATooBigException e) {
				gpa = 4.0;
				System.out.println(e.getMessage());
			} catch (GPATooSmallException e) {
				gpa = 0.0;
				System.out.println(e.getMessage());
			} 
			
		} while (true);
		System.out.println(s1);
		
		System.out.println("Enter a new GPA: ");
		gpa = scanner.nextDouble();
		do {
			try {
				s1.setGpa(gpa);
				break;
			} catch (GPATooBigException | GPATooSmallException e) {
				System.out.println("Incorrect GPA entered. Enter a new one: ");
				gpa = scanner.nextDouble();
			} 
		} while (true); 
		
		System.out.println(s1);
	}

}
