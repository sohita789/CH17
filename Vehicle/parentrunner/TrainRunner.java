package com.xworkz.parentrunner;

import com.xworkz.parent.MetroTrain;
import com.xworkz.parent.SubUrbanTrain;

public class TrainRunner {

	public static void main(String[] args) {
		
		
		MetroTrain metrotrain=new MetroTrain(24656,"bangalore","hyderabad");
		
		metrotrain.display();

		SubUrbanTrain suburbantrain=new SubUrbanTrain(56743,"chennai","mumbai");
		
		suburbantrain.display();
	}

}
