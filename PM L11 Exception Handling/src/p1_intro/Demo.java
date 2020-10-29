package p1_intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo {
// Exceptions: are errors that can be handled by the programmer
	// Errors: Errors are errors that cannot be handled by the programmer.

	public static void main(String[] args) {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter a file name:");
		String fileName = scanner2.nextLine();
		do {
			try {
				File myFile = new File(fileName);
				Scanner scanner1 = new Scanner(myFile);
				String line = scanner1.nextLine();
				System.out.println(line);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("No such file found. Enter the correct file name:");
				fileName = scanner2.nextLine();
			} 
		} while (true);
		
		
		System.out.println("Done!");

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter an integer: ");
//		try {
//			int number = scanner.nextInt();
//			System.out.println("The number entered is: " + number);
//		} catch (InputMismatchException e) {
//			System.out.println("Hey, you entered something that is not an integer.");
//			e.printStackTrace();
//		}
//		System.out.println("Done!");

//		int[] arr = { 1, 2, 3, 4, 5 };
//
//		try {
//			System.out.println(arr[5]); // Runtime exception
//			System.out.println("Legit!");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index of bounds Exception!");
//		}
//		System.out.println("Done!");
	}

}
