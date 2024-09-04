package com.xworkz.hybridInheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		
		        Dog dog = new Dog();
		        Lion lion = new Lion();
		        HybridAnimal hybridAnimal = new HybridAnimal();
		        
		        dog.eat(); // Inherited from Animal
		        dog.domesticBehavior(); // Implemented from Domestic interface
		        
		        lion.eat(); // Inherited from Animal
		        lion.wildBehavior(); // Implemented from Wild interface
		        
		        hybridAnimal.eat(); // Inherited from Animal
		        hybridAnimal.domesticBehavior(); // Implemented from Domestic interface
		        hybridAnimal.wildBehavior(); // Implemented from Wild interface
		    }
		}


	


