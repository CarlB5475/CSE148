package p2_applications;

public class MallardDuck extends Duck implements Flyable, Swimmable, Quackable {

	public MallardDuck(String species, String gender) {
		super(species, gender);
	}

	@Override
	public void fly() {
		System.out.println("Mallard duck flys its own way!");
	}
}
