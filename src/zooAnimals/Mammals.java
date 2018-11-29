package zooAnimals;

import zooAnimals.Animals;
import zooAnimals.Mammals;

public abstract class Mammals extends Animals{
	
	//Attributes
	private String species;
	String name;
	String subCatagory;
	String colour;
	String noise;
	
	//Constructors
	public Mammals(String vSpecies, String vName, String vColour, String vSubCategory, String vNoise) {
		super(vSpecies, vName, vColour, vSubCategory, vNoise);
		this.name = vName;
		this.noise = vNoise;
		this.colour = vColour;
		this.subCatagory = vSubCategory;
	}
	
	
	//Methods
	public String getSpecies() {
		return this.species;
	}
	
}
