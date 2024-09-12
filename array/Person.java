package com.xworkz.array;

public class Person {
	
	    // Attributes of the Person class
	    private String name;
	    private String email;
	    private int age;
	    private String mobileNo;

	    // Constructor to initialize a Person object
	    public Person(String name, String email, int age, String mobileNo) {
	        this.name = name;
	        this.email = email;
	        this.age = age;
	        this.mobileNo = mobileNo;
	    }

	    // Getter methods for Person attributes
	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getMobileNo() {
	        return mobileNo;
	    }

	    // Method to display Person details
	    @Override
	    public String toString() {
	        return ("Name: " + name + ", Email: " + email + ", Age: " + age + ", Mobile No: " + mobileNo);
	    }
	   
	    }
	    

	  

