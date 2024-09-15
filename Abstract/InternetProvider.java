package com.xworkz.Abstract;

public class InternetProvider extends Provider{

	public InternetProvider(String name, String CEOName) {
		super(name, CEOName);
		System.out.println("created the InternetProvider with name and CEOName");
	}
	public void show() {
		System.out.println("running show in InternetProvider");
	}
	@Override
	public void service() {
		// TODO Auto-generated method stub
		
	}

}
