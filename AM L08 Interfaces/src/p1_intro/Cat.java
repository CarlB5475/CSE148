package p1_intro;

public class Cat extends Animal implements Pet, HousePet{

	public Cat(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}

	@Override
	public void playTrick() {
		System.out.println("Jump!");
	}

	@Override
	public void eat() {
		System.out.println("eat fish!");
	}

	@Override
	public void sleep() {
		System.out.println("The cat is sleeping!");
	}

	@Override
	public void grow() {
		System.out.println("The Cat is growing!");
	}
	
	
	
}
