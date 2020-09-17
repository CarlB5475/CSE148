package p1;

public class Demo {

	public static void main(String[] args) {
		StudentBagMachine theMachine = new StudentBagMachine(10);
		theMachine.insert("John", "Doe", "(631)123-4567", 0.0, "CSE");
		theMachine.insert("Jane", "Doe");
		theMachine.insert(new Name("Jose", "Fernandez"));
		
		theMachine.display();
		theMachine.deleteById("1");
		System.out.println();
		theMachine.display();
	}

}
