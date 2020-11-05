package p3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		System.out.println("Enter your age: ");
		do {
			try {
				age = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("The age entered is incorrect. Enter again: ");
			} 
		} while (true);
		System.out.println("Your age is: " + age);
		System.out.println("Program finished!");
	}

}
