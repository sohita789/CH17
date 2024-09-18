package com.xworkz.pg;

public class PgName {
	 public  PgRule pgrule;
	 
	 public PgName() {
		 System.out.println("created PgName with no args constructor");
	 }
  
	    
	    
	    public PgRule getPgrule() {
		return pgrule;
	}



	public void setPgrule(PgRule pgrule) {
		this.pgrule = pgrule;
	}



		public void check() {
	    	if(pgrule!=null) {// avoids null pointer exception
	    		System.out.println("pgrule is a null");
	    		pgrule.costPerMonth();
	    		pgrule.wifi();
	    	}
	    	else {
	    		System.out.println("pgrule is not null");
	    	}
	    }



		public void setPgRule(Object pgRule2) {
			// TODO Auto-generated method stub
			
		}}

