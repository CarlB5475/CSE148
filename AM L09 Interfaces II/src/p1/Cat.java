package p1;

public class Cat extends Pet implements Playable {
	private String gender;

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void play() {
		System.out.println("Playing");
	}

	@Override
	public void rollOver() {
		System.out.println("Roll-over");
	}

	@Override
	public void setBoth(String name, int age) {
		setName(name);
		setAge(age);
	}

}
