package ch.klandolt.java.ifacepoly;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<IAnimal> dogcatList = new ArrayList<IAnimal>();
		dogcatList.add(new Dog("Fred"));
		Dog Schaeferhund = new Dog("Bello");
		
		//Schaeferhund.speak();
		
		dogcatList.add(Schaeferhund);
		
		System.out.println(dogcatList.toString());
		
		 dogcatList.add(new Cat("Wanda"));
		
		 System.out.println(dogcatList.toString());

	}

}
