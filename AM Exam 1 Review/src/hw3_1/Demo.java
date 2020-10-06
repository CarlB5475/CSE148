package hw3_1;

public class Demo {

	public static void main(String[] args) {
		int numberOfStudentsToInsert = 40;
		int maxSize = 100;
				
		StudentBag theBag = new StudentBag(maxSize);
		
		for (int i = 0; i < numberOfStudentsToInsert; i++) {
			theBag.insert(Utilities.emitStudent());
		}
		theBag.display();
		theBag.removeById("1");
		System.out.println("After removal: ");
		theBag.display();
	}

}
