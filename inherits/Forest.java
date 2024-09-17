package com.xworkz.inherits;

public interface Forest {
	// First interface
	interface Animal {
	    void eat();
	}

	// Second interface
	interface Pet {
	    void play();
	}

	// Third interface that inherits from both Animal and Pet
	interface Domestic extends Animal, Pet {
	    void beFriendly();
	}

	// Class implementing the Domestic interface
	class Dog implements Domestic {
	    @Override
	    public void eat() {
	        System.out.println("Dog is eating");
	    }

	    @Override
	    public void play() {
	        System.out.println("Dog is playing");
	    }

	    @Override
	    public void beFriendly() {
	        System.out.println("Dog is being friendly");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.eat();
	        myDog.play();
	        myDog.beFriendly();
	    }
	}

}
