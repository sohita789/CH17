package com.xworkz.inherits;

public class PickleRunner {

	public static void main(String[] args) {
		Pickle pickle=new Pickle();
		MangoPickle mangoPickle=new MangoPickle();
		
		pickle.taste();
		mangoPickle.taste();
		mangoPickle.haveMango();
		pickle.taste();
		
	}

}
