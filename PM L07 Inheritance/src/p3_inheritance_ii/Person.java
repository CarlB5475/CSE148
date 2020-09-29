package p3_inheritance_ii;

// superclass, parent class, base class
public class Person {
	private String name;
	private String id;
	private String phone;

	private static int idCounter = 0;

	public Person(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = String.valueOf(idCounter++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", phone=" + phone + "]";
	}

}
