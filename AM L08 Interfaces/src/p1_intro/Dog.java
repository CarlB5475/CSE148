package p1_intro;

public class Dog extends Animal implements Pet, HousePet{
	private String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + ", breed=" + breed + "]";
	}

	@Override
	public void playTrick() {
		System.out.println("Roll Over!");
	}

	@Override
	public void eat() {
		System.out.println("Eat dog food.");
	}

	@Override
	public void sleep() {
		System.out.println("The dog is sleeping");
	}

	@Override
	public void grow() {
		System.out.println("The Dog is growing!");
	}
	
	
}
