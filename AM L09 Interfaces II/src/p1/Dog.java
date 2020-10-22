package p1;

public class Dog extends Pet {
	private String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	
	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void setBoth(String name, int age) {
		setName(name);
		setAge(age+5);
	}


	@Override
	public String toString() {
		return "Dog [" + super.toString() + ", breed=" + breed + "]";
	}


	public Dog() {
		super();
	}
}
