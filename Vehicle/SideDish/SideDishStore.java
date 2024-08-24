package com.xworkz.SideDish;

import com.xworkz.Market.MarketData;

public class SideDishStore {

	
		
		private SideDishData[] datas=new SideDishData[5];
		private int index=0;
		
		 
		 
		 public void buy(SideDishData data)
		 {
			this.datas[this.index]=data;
			this.index++;
			
		 }
		 
		 public void show()
		 {
				 
				 for(SideDishData ref:this.datas)
					 {
					if(ref!=null)
					{
					ref.display();	
					 }
				 else
				 {
					 
						 System.out.println("data is null");
				}
					 
				 }
			 }
	}


