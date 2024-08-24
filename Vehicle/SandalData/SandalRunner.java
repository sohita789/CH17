package com.xworkz.SandalData;



public class SandalRunner {

	public static void main(String[] args) {
		
SandalStore stores=new SandalStore();
		
		SandalData data1=new SandalData("walkmate",6,400,"black");
		SandalData data2=new SandalData("bata",7,800,"pink");
		SandalData data3=new SandalData("luvnars",8,500,"red");
		SandalData data4=new SandalData("yono",7,350,"gray");
		SandalData data5=new SandalData("paragon",9,600,"blue");
		stores.buy(data1);
		stores.buy(data2);
		stores.buy(data3);
		stores.buy(data4);
		stores.buy(data5);
		stores.show();
	}

	}



