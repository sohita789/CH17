package com.xworkz.MultilevelInheritance;

public class AnimalRunner{

		 public static void main(String[] args) {
		        Dog myDog = new Dog();
		        
		        myDog.eat();  // Inherited from Animal
		        myDog.sleep(); // Inherited from Mammal
		        myDog.bark();  // Defined in Dog
		    }
		}


	
