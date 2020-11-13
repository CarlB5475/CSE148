package p2;

public class Demo {

	public static void main(String[] args) {
		String[] names = new String[100];
		String[] randomNames = {"Adam", "Billy", "Cathy", "Dave", "Ellen", "Frankie"};
		int j = 0;
		
		for (int i = 0; i < randomNames.length; i++) {
			int index1 = (int) (Math.random() * 100);
			names[index1] = randomNames[j++];
		}
		
		for(int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				try {
					throw new NullValueException();
				} catch (NullValueException e) {
				}
			} else {
				System.out.println(names[i]);
			}
		}
	}

}
