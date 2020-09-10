package p1_classes;

public class Demo {

	public static void main(String[] args) {
		Cat cat1;
		cat1 = new Cat();
		cat1.setName("Jose");
		cat1.jump();
		
		cat1.grow();
		cat1.grow();
		System.out.println("The cat age is now: " + cat1.grow());
		
		System.out.println(cat1.getName());
		
	}

}
