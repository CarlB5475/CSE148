package p1_hw1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int feedTimes = 50;
		Cat c1 = new Cat();
		c1.setName("Al");
		c1.setWeight(3.5);

		c1.feed(20);
		System.out.println("Weight is: " + c1.getWeight());
		for (int i = 0; i < feedTimes; i++) {
			c1.feed((int) (Math.random() * 50));
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of food you feed: ");
		int amount = scan.nextInt();
		c1.feed(amount);
		System.out.println((int)20.5/16 + " lbs" + " and " + (20%16) + " oz");
//		System.out.println("Weight is: " + c1.getWeight()/16);
		
		System.out.println(Long.MAX_VALUE + " -- " + Long.MIN_VALUE);
	}


}
