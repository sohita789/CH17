package com.workz.Airport.Grinder;

public class SareeRunner {

	public static void main(String[] args) {
		
		Saree saree=new Saree("kancheevaram silks", "silk", "pink");
		System.out.println(saree.toString());
		
		Saree saree1=new Saree("cotton Saree","fancy","red");
		System.out.println(saree1.toString());
		
		saree.setCost(15000);
		saree.setNoOf(4);

		boolean check=saree.equals(saree1);
		System.out.println("saree1 is same as saree");

	}

}
