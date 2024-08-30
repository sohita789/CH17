package com.xworkz.sanitizer.things;

public class Telephone {
   private	String company;
   private String username;
   private String area;
   
   
public Telephone(String company, String username, String area) {
	super();
	this.company = company;
	this.username = username;
	this.area = area;
}
   
   public void call() {
	   System.out.println("running call in Telephone");
	   
   }
   public void receive() {
	   System.out.println("company:"+company);
	   System.out.println("username:"+username);
	   System.out.println("area:"+area);
	    }

}
