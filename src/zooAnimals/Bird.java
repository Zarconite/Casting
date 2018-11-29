package zooAnimals;

import zooAnimals.Bird;

public class Bird extends Animals{

	//Attributes
	String name;
	String subCatagory;
	String colour;
	String noise;
	
	
	//Constructors
	public Bird(String vSpecies, String vName, String vColour, String vSubCategory, String vNoise) {	
		super(vSpecies, vName, vColour, vSubCategory, vNoise);
		this.name = vName;
		this.noise = vNoise;
		this.colour = vColour;
		this.subCatagory = vSubCategory;
	}
	
	
	//Methods

	public String toString() {
		return "This is a "+this.colour+" "+this.subCatagory+" bird and they are called "+this.name+" And they go "+this.noise;
	}
	
}
