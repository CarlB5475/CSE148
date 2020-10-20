package p1_intro;

public abstract class Animal { // opposite of a concrete class
	private String name; // default access  or package access
	private int id;
	
	private static int idCounter = 0;
	
	//Animal extends SuperAnimal extends Object
	public Animal(String name) {
		super();
		this.name = name;
		this.id = idCounter++;
	}

	public String getName() {
		return name;
	}
	
	public abstract void grow();
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", id=" + id + "]";
	}
	
	
}
