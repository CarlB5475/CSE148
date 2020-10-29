package p5;

import java.util.Arrays;

import p1.Animal;
import p2.Wolf;
import p3.Dog;
import p4.AnimalBag;

public class Demo {

	public static void main(String[] args) {
		final int MAX_BAG_SIZE = 100;
		AnimalBag theBag = new AnimalBag(MAX_BAG_SIZE);
		
		Animal w1 = new Wolf("W2", 1, 5);
		Animal w2 = new Wolf("W2", 10, 50);
		Animal d1 = new Dog("W2", 1, 5);
		Animal d2 = new Dog("D2", 10, 100);
		
		theBag.insert(w1);
		theBag.insert(w2);
		theBag.insert(d1);
		theBag.insert(d2);
		
		theBag.display((a) -> {
			return ((Animal)a).getName().equals("W2") && ((Animal)a).getAge() == 1.0;
		});
		
		
//		Animal[] arr = theBag.find((a) -> {
//			return ((Animal)a).getName().equals("D2") || ((Animal)a).getAge() == 10.0;
//		});
//		System.out.println(Arrays.toString(arr));
//		
		
//		Animal wolf2 = theBag.findWolfByPosition(2);
//		int id = wolf2.getId();
//		theBag.removeById(id);
//		
//		theBag.display();
//		Dog dog2 = theBag.findDogByPosition(1);
		
		
		
		
		
		
		//5.1
//		theBag.display();
		
//		//5.2
//		theBag.removeById(1);
//		theBag.display();
//		
//		//5.3
//		Animal dog = theBag.findById(3);
//		System.out.println(dog);
//		
//		// 5.4
//		Animal wolf = theBag.findById(0);
//		wolf.makeNoise();
//		
//		// 5.5
//		Animal dog2 = theBag.findById(2);
//		dog2.makeNoise();
//		
//		// 5.6
//		theBag.display();
	}

}
