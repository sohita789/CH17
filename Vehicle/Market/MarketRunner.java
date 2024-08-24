package com.xworkz.Market;

public class MarketRunner {
	
	public static void main(String[] args) {
	MarketStore store=new MarketStore();
	
	MarketData data1=new MarketData("Ashirwad Supermarket","rajajinagar");
	MarketData data2=new MarketData("bigbazar","kalaburagi");
	MarketData data3=new MarketData("Dmart","majestic");
	MarketData data4=new MarketData("superMarket","kalaburagi");
	MarketData data5=new MarketData("More","Bangalore");
	store.buy(data1);
	store.buy(data2);
	store.buy(data3);
	store.buy(data4);
	store.buy(data5);
	store.show();
}

}


