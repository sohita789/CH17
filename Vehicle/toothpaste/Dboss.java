package com.xworkz.sanitizer.things;

public class Dboss {
	
	
	    private Gun bossGun;
	    
	    public Dboss(Gun gun) {
	        this.bossGun = gun;
	    }
	    
	    public void showBossGun() {
	        System.out.println("Boss's gun details:");
	        bossGun.display();
	    }
	    public void fire() {
	    	System.out.println("running fire");
	    }
	}


