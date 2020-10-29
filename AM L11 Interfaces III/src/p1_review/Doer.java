package p1_review;

public class Doer implements Doable {

	private String name;
	private int age;

	public Doer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public void doThis() {
		System.out.println("Do this!");
	}

	@Override
	public void doThat() {
		System.out.println("Do that!");
	}

	@Override
	public String toString() {
		return "Doer [name=" + name + ", age=" + age + "]";
	}
}
