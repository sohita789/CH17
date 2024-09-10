package com.xworkz.Airport;

import com.workz.Airport.Grinder.BedSheet;

public class CreditCard {
	private String cardNo;
	private String cardHolder;
	private String expireDate;
	private String type;
	private double creditcardLimit;
	private double currentBalance;
	private boolean checkBalance;
	public CreditCard(String cardNo, String cardHolder, String expireDate, String type, double creditcardLimit,
			double currentBalance,boolean checkBalance) {
		super();
		this.cardNo = cardNo;
		this.cardHolder = cardHolder;
		this.expireDate = expireDate;
		this.type = type;
		this.creditcardLimit = creditcardLimit;
		this.currentBalance = currentBalance;
		this.checkBalance = checkBalance;
	}
	public CreditCard(String cardNo, String cardHolder, double creditcardLimit) {
		super();
		this.cardNo = cardNo;
		this.cardHolder = cardHolder;
		this.creditcardLimit = creditcardLimit;
	}
	
	@Override
	public String toString() {
	

		return"Creditcard[cardNo="+cardNo+",cardHolder="+cardHolder+",creditcardLimit="+creditcardLimit+"]";
		
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in creditcard");
		if(obj!=null) {
			
			if(obj instanceof CreditCard) {
				CreditCard casted=(CreditCard)obj;
				if(this.cardNo.equals(casted.cardNo)&&this.cardHolder.equals(casted.cardHolder)&&this.creditcardLimit==casted.creditcardLimit) {
					System.out.println("left equals to right");
					return true;
					}}
					else {
						System.out.println("obj is not a saree");
					}
					}
		return checkBalance ;
		
			
	}
	public void setcardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public void setcardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	public void setcreditcardLimit(double creditcardLimit) {
		this.creditcardLimit= creditcardLimit;
		
	}
		
		
  
}





