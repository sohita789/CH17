package com.xworkz.parent;

public class Market {
	
	private String name;
	private String location;
	private int shops;
	private String type;
	
	public Market(String name, String location, int shops, String type) {
		super();
		this.name = name;
		this.location = location;
		this.shops = shops;
		this.type = type;
	}

	public Market(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	
	public void sale() {
		System.out.println("name:"+name);
		System.out.println("location:"+location);
		System.out.println("shops:"+shops);
		System.out.println("type:"+type);
	
	}

}
