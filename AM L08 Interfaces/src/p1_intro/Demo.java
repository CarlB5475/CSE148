package p1_intro;

public class Demo extends Object{
	
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			Pet d1 = new Dog("Doggie", "Golden");
			HousePet c1 = new Cat("Kittie");
			System.out.println(d1);
			((Dog)d1).playTrick();
			((Dog)d1).eat();
			((Dog)d1).sleep();
//			d1.grow();
			
			System.out.println();
			
			System.out.println(c1);
//			c1.playTrick();
//			c1.eat();
//			c1.sleep();
//			c1.grow();
			System.out.println();
		}
		
		
	}

}
