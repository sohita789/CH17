package com.xworkz.encapsulation.internal;

public class HumanRunner {

	public static void main(String[] args) {
	
		Human human=new Human();
		human.setGender('M');
		human.setAge(22);
		
		System.out.println("Gender:"+human.getGender());
		System.out.println("Age:"+human.getAge());

	}

}
