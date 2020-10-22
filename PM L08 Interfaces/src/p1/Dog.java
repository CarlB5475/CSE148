package p1;

public class Dog extends Pet implements Showable, Playable, Soundable {

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playTrick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showSpecies() {
		// TODO Auto-generated method stub
		
	}

}
