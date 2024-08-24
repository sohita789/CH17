package com.xworkz.Market;

public class MarketData {
	         String name;
			 String location;
			 
			public  MarketData( String name,String location)
			{
				this.name=name;
				this.location=location;
			}
			
			public void display()
			{
				System.out.println("name:"+this.name);
				System.out.println("name:"+this.location);
			}

		}
		