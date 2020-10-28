package p1;

public abstract class Pet { // not concrete anymore
	private String name;
	private int age;

	private final int WEIGHT = 10;
	
	// overloaded constructors
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Pet() {
		super();
	}
	
//	public void setBoth(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	public abstract void setBoth(String name, int age);

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

	@Override
	public String toString() {
		return name + ": " + age;
	}

}
