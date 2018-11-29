package zooAnimals;

import java.util.ArrayList;

import zooAnimals.Animals;
//import zooAnimals.Mammals;
//import zooAnimals.Avian;
//import zooAnimals.Cat;

public class Main {

	public static void main(String[] args) {
		
		inputAnimal();
			
	}
	
	public static String inputAnimal() {

		Cat Chester = new Cat("Cat","Chester","Orange","Tabby","Meow");
		Cat Smokey = new Cat("Cat","Smokey","Grey","Bengal","Meow");
		Bird Tweety = new Bird("Bird","Tweety","Yellow","Canary","Chirp");
		ArrayList<Animals> zoo = new ArrayList<Animals>();
		
		//zoo.add(Animals);
		
		zoo.add(Chester);
		zoo.add(Smokey);
		zoo.add(Tweety);
		
		String Output="";
		for(Animals a : zoo) {
			System.out.println(a);
			Output=Output+a;
			}
		System.out.println(Output);
		return Output;
		}
	
	public static void Return() {

	}

}
