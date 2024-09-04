package com.xworkz.hierarchialInheritance;

public class AnimalRunner {

	public static void main(String[] args) {

	            Dog myDog = new Dog();
		        Cat myCat = new Cat();
		        Bird myBird = new Bird();
		        
		        // Each subclass can use the method from Animal
		        myDog.eat(); // Inherited from Animal
		        myDog.bark(); // Method specific to Dog
		        
		        myCat.eat(); // Inherited from Animal
		        myCat.meow(); // Method specific to Cat
		        
		        myBird.eat(); // Inherited from Animal
		        myBird.chirp(); // Method specific to Bird
		    }
		}


	


