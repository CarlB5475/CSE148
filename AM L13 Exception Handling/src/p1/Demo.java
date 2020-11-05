package p1;

import java.io.File;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		//1. Errors: programmers cannot handle
		//2. Exceptions: programmers can handle
		
		File file = new File("GPA.txt");
//		Scanner scanner = new Scanner(file); // checked exceptions, 
		System.out.println("Enter your GPA: "); // checked by compiler
//												// compiler converts source code file to machine (byte) code
//												// bytecode or machine code is executed by Java Virtual Machine (JVM)
//		double gpa = scanner.nextDouble();
//		System.out.println("Your GPA is: " + gpa);

//		int[] numbers =new int[10];
//		numbers[0] = 1;
//		numbers[1] = 2;	
		Person[] persons = new Person[10];
		persons[0] = new Person("A", 1);
		
		System.out.println(persons[1].toString()); // unchecked exceptions/Runtime exceptions

	}

}
