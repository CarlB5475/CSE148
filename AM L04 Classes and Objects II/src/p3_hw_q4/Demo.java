package p3_hw_q4;

public class Demo {

	public static void main(String[] args) {
		int stringLength = 2 + (int)(Math.random() * 8);
		String name = "";
		for (int i = 0; i < stringLength; i++) {
			name += ((char)(97 + (int) (Math.random() * (26)))); // 97 - 122
		}
		System.out.println(name);
	}

}
