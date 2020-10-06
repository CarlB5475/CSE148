package hw4_1;

public class Demo {

	public static void main(String[] args) {
		int numberOfPersonsToInsert = 40;
		int maxSize = 100;
				
		PersonBag theBag = new PersonBag(maxSize);
		
		for (int i = 0; i < numberOfPersonsToInsert/2; i++) {
			theBag.insert(Utilities.emitStudent());
			theBag.insert(Utilities.emitInstructor());
		}
		
		System.out.println(theBag.removeById("3"));
	}

}
