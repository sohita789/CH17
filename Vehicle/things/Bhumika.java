package com.xworkz.sanitizer.things;

public class Bhumika {
	
	private WashingMachine machine;
    
    public Bhumika(WashingMachine machine) {
        this.machine = machine;
    }
    
    public void show() {
        System.out.println("running show in Bhumika");
        machine.show();
    }
    public void cleanse() {
    	System.out.println("running cleanse");
    }
}





