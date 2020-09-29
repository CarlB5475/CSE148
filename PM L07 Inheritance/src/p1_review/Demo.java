package p1_review;

public class Demo {

	public static void main(String[] args) {
		System.out.println(ToolBox.emitName());
		System.out.println(Math.random());
		System.out.println(Math.pow(3, 3));
		System.out.println(Math.PI);
		
		Cat c1 = new Cat();
		c1.setName("Jose");
		System.out.println(c1.getName());
		
		Cat c2 = new Cat();
		System.out.println(c2.getName());
	}

}
