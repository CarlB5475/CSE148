package p2;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(numbers[0]);
			System.out.println(numbers[1]);
			System.out.println(numbers[2]);
			System.out.println(numbers[5]);
			System.out.println(numbers[3]);
		} catch (RuntimeException e) {
			e.printStackTrace();
//			System.out.println("There is an ArrayIndexOutOfBoundSException!");
		} catch(Exception e) {
			System.out.println("A Runtime exception occurred");
		} finally {  // Guaranteed execution
			System.out.println("Finally!");
		}
		
		System.out.println("The program is finished!");
	}

}
