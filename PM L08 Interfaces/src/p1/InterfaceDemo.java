package p1;

public class InterfaceDemo {

	public static void main(String[] args) {
		Snake snake1 = new Snake();
		snake1.setAge(50);
		snake1.setName("Snake1");
		snake1.showSpecies();
		Showable.showMySpecies();
		snake1.showMySpeciesAgain();
	}

}
