package com.xworkz.SideDish;

public class SideDishRunner {

	public static void main(String[] args) {
		
		SideDishStore store=new SideDishStore();
		
		SideDishData data1=new SideDishData("gobi manchoori",125,"chats");
		SideDishData data2=new SideDishData("icecream",85,"desserts");
		SideDishData data3=new SideDishData("pineapplejuice",50,"juice");
		SideDishData data4=new SideDishData("coffee",70,"hotdrink");
		SideDishData data5=new SideDishData("coldCoffee",200,"cooldrink");
		store.buy(data1);
		store.buy(data2);
		store.buy(data3);
		store.buy(data4);
		store.buy(data5);
		store.show();
	}

	}


