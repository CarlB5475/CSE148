package p1;

public abstract class Pet {
	private String name = "pet1";
	private int age = 5;

	// overloaded constructors
	public Pet() { // no-arg constructor
		super();
	}

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
