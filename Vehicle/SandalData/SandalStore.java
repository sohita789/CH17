package com.xworkz.SandalData;

import com.xworkz.Market.MarketData;

public class SandalStore {

	private SandalData[] datas=new SandalData[5];
	private int position=0;
	
	 
 public void buy(SandalData data)
	 {
		this.datas[this.position]=data;
		this.position++;
		
	 }
	 	 public void show()
	 {
			 
		for(SandalData value:this.datas)
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

		 
				 
			
		 
		

