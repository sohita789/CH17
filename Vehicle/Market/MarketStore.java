package com.xworkz.Market;

public class MarketStore {
	
		private MarketData[] datas=new MarketData[5];
		private int position=0;
		
		 
	 public void buy(MarketData data)
		 {
			this.datas[this.position]=data;
			this.position++;
			
		 }
		 	 public void show()
		 {
				 
			for(MarketData value:this.datas)
			{
			if(value!=null)
			{
			value.display();	
					 }
			else
			{
					 
			 System.out.println("data is null");
				}
					 
				 }
			 }
	}

