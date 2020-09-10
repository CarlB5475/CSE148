package p1_classes;

public class Demo {

	public static void main(String[] args) {
		Cat cat1 = new Cat(); // new key word used to create object
		Cat cat2 = new Cat();
		
		cat1.setName("Al");
		cat1.setAge(5);
		cat1.setIsMale(true);
		System.out.println(cat1.getName() + ": " +  cat1.getGender()
				+", "	+ cat1.getAge());
		
		System.out.println(cat1.getCategory());
		
		cat2.setName("Bill");
		cat2.setAge(10);
		cat2.setIsMale(false);
		
		System.out.println(cat2.getName() + ": " +  cat2.getGender()
		+", "	+ cat2.getAge());
		
		System.out.println(cat2.getCategory());
		
		
		cat1.setCategory("Man");
		System.out.println(cat1.getCategory());
		System.out.println(cat2.getCategory());
		
		Cat cat3 = new Cat();
		System.out.println(cat3.getCategory());
	}

}
