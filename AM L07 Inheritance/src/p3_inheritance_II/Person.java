package p3_inheritance_II;

// superclass
public class Person {
	private String name;
	private String id;
	private String phone;

	private static int idCounter = 0;

	public Person(String name, String phone) {
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

	public String getId() {
		return id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", phone=" + phone + "]";
	}

}
