package p1_hw1;

public class RandomDemo {

	public static void main(String[] args) {
		int stringLength = 2 + (int)(Math.random() * 10);
		String str = "";
		for (int i = 0; i < stringLength; i++) {
			str += (char) (65 + (int) (Math.random() * 26));
		}
		System.out.println(str);
	}

}
