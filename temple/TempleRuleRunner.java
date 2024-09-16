package com.xworkz.temple;

public class TempleRuleRunner {

	public static void main(String[] args) {
	
		
		IsckonTemple temples;
	
		Temple temple=new Temple();
		temple.jeansAllowed();
		temple.poojaTimings();
		temple. wearChudidars();
		temple. maintainSilence();
	    temple. phoneHasToSilenced();
	    temple. timings();
	    temple. phoneNotAllowed();
	    temple. showRespect();
	    temple. showDeity();
	    temple. followRitualProcedures();
	    
        IsckonTemple temple2=new Temple();
        temple2.jeansAllowed();
        temple2.poojaTimings();
        
        System.out.println(temple);
        System.out.println(temple2);

	}

}
