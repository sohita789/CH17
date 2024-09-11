package com.workz.polymorphism.compileTime;
//* Over-riding :Subclass over-rides(change logic) the Methods inherited from the parent class. *@Over-ride :It is a annotation: It ensures that it is actually over-riding.
//*Over-riding is also known as the RunTime polymorphism ,it is called by the JVM...* run time polymorphism Achieved Overiding.

public class GeneralStore {
	String name;
    String area;
	
	public GeneralStore() {
		super();
		System.out.println("created the GeneralStore using no arg constructor");
	}

	public GeneralStore(String name,String area) {
		super();
		this.name = name;
		this.area=area;
		System.out.println("created the generalStore using String name,area");
	}
	
	public void open() {
		System.out.println("storename:"+name);
	}
	public void close() {
		System.out.println("storename:"+name);
		System.out.println("storeArea:"+area);
		
	}

}
