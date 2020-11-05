package p4;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

//		try {
//			System.out.println(numbers[5]);
//		} catch (RuntimeException e) {
////			e.printStackTrace();
//		}
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println(numbers[i]);
			} catch (Exception e) {
				System.out.println("Exception occurred!");
			}
		}

		System.out.println("Finished");
	}

}
