package zooAnimals;

import zooAnimals.Animals;

public abstract class Animals {
		//Attributes
		String name;
		String subCatagory;
		String colour;
		String noise;
		String species;
		
		
		//Constructors
		public Animals(String vSpecies, String vName, String vColour, String vSubCategory, String vNoise) {	
			this.name = vName;
			this.noise = vNoise;
			this.colour = vColour;
			this.subCatagory = vSubCategory;
		}
		
		
		//Methods
		
		interface makeNoise{
			
		}
		
		public String toString() {
			
			return "This is a "+this.colour+" "+this.subCatagory+" "+this.species+ " and they are called "+this.name+" And they go "+this.noise;
		}
}

