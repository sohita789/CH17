package com.xworkz.array;

public class PersonRunner {

	public static void main(String[] args) {
	
	        // Create an array of 5 Person objects
	        Person[] persons = new Person[5];

	        // Create a single Person instance to copy
	        Person samplePerson = new Person("sohita", "sohitapatil@gmail.com", 22, "sohita");
	        

	        // Populate the array with 5 copies of the sample Person
	        for (int i = 0; i < persons.length; i++) {
	            persons[i] = samplePerson;
	        }

	        // Use a forEach loop to print the details of each Person
	        for (Person person : persons) {
	            System.out.println(person);
	            
	          
	        }
	    }
	}
	


