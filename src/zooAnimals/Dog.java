package zooAnimals;

import zooAnimals.Dog;

public class Dog extends Mammals{

	//Attributes
	String name;
	String subCatagory;
	String colour;
	String noise;
	
	
	//Constructors
	public Dog(String vSpecies, String vName, String vColour, String vSubCategory, String vNoise) {	
		super(vSpecies, vName, vColour, vSubCategory, vNoise);
		this.name = vName;
		this.noise = vNoise;
		this.colour = vColour;
		this.subCatagory = vSubCategory;
	}
	
	
	//Methods
	
	interface makeNoise{
		
	}
	
	public String toString() {
		
		return "This is a "+this.colour+" "+this.subCatagory+" cat and they are called "+this.name+" And they go "+this.noise + super.toString();
	}
}
