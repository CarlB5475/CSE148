package p1;

public abstract class Animal {
	private String name;
	private int id;
	private double age;

	private static int idCounter = 0;

	public Animal(String name, double age) {
		this.name = name;
		this.age = age;
		id = idCounter++;
	}
	
	public void makeNoise() {
		System.out.println("Grrrrr");
	}
	
	public void grow(int number) {
		age += number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

}
