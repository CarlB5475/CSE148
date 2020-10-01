package p3_inheritance_II;

// superclass
public abstract class Person { // abstract class. not instantiable
	private String name;
	private String id;
	private String phone;

	private static int idCounter = 0;

	// overloaded constructors
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.id = String.valueOf(idCounter++);
	}
	
	public Person() { // no-arg constructor
		
	}

	// overloaded methods
	public String getName() { // final method
		return name;
	}
	
	public String getName(String prefix) {
		return prefix + " " + name;
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
