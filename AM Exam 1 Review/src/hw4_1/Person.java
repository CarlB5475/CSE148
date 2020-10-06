package hw4_1;

public abstract class Person {
	private Name name;
	private String id;
	
	private static int idCounter = 0;
	
	public Person(Name name) {
		this.name = name;
		this.id = String.valueOf(idCounter++);
	}
	
	public Person(String fn, String ln) {
		this.name = new Name(fn, ln);
		this.id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}
