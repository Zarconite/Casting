package zooAnimals;

import java.util.ArrayList;

import zooAnimals.Animals;
import zooAnimals.Mammals;
import zooAnimals.Bird;
import zooAnimals.Cat;
import zooAnimals.Dog;
import zooAnimals.Owl;

public class Main {

	
	public static void main(String[] args) {
		
		inputAnimal();
		for(Animals a:Zoo.zoo) {
			System.out.println(a.toString());
			
		}
	}
	
	public static String inputAnimal() {

		Cat Chester = new Cat("Cat","Chester","Orange","Tabby","Meow");
		Cat Smokey = new Cat("Cat","Smokey","Grey","Bengal","Meow");
		Dog Max = new Dog("Dog","Max","Brown","Labrador","Bark");
		Budgie Tweety = new Budgie("Bird","Tweety","Yellow","Canary","Chirp");
		Owl Soren = new Owl("Bird","Soren","White","Snowy","Hoot");
		
		//zoo.add(Animals);
		
		Zoo.zoo.add(Chester);
		Zoo.zoo.add(Smokey);
		Zoo.zoo.add(Tweety);
		Zoo.zoo.add(Max);
		Zoo.zoo.add(Soren);
		
		/*String Output="";
		for(Animals a : zoo) {
			System.out.println(a);
			Output=Output+a;
			}
		System.out.println(Output);*/
		return "";
		}
	
	
	

}
