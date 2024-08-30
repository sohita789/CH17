package com.xworkz.parentrunner;

import com.xworkz.parent.OnlineMarket;
import com.xworkz.parent.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {
		
		SuperMarket supermarket=new SuperMarket("Ashirwad SuperMarket","rajajinagar",1,"general store");
		
		SuperMarket supermarket1=new SuperMarket("lulu","majestic",10,"mall");

		supermarket.sale();
		supermarket1.sale();
		
		OnlineMarket onlinemarket=new OnlineMarket("amazon","max");
		
		OnlineMarket onlinemarket1=new OnlineMarket("Myntra","zudio");
		
		onlinemarket.sale();
		onlinemarket1.sale();
		
	}

}
