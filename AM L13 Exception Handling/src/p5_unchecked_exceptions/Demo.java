package p5_unchecked_exceptions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int n1 = scanner.nextInt();
		System.out.println("Enter second integer: ");
		int n2 = scanner.nextInt();
		try {
			double result = n1/n2;
			System.out.println("The result is: " + result);
		} catch (ArithmeticException e1) {
//			e.printStackTrace();
			System.out.println(e1.getMessage());
			System.out.println("This is Arithmetic Exception");
		} catch(IllegalArgumentException e2) {
			System.out.println(e2.getMessage());
			System.out.println("This is IllegalArgument Exception");
		} catch(Exception e3) {
			System.out.println(e3.getMessage());
			System.out.println("This is Runtime Exception!");
		}
		System.out.println("End!");
	}

}
