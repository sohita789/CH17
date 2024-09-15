package com.xworkz.Abstract;

public class LenovoProvider extends Provider{
	int profit;
	public LenovoProvider(String name, String CEOName, int profit) {
		super(name, CEOName);
		this.profit = profit;
	}

	public LenovoProvider(String name, String CEOName) {
		super(name, CEOName);
		
		System.out.println("created the LenovoProvider with name and CEOname");
	}
	public void show() {
		System.out.println("running the show LenovoProvider ");
	}
	@Override
	public void service() {
		// TODO Auto-generated method stub
		
	}

}
