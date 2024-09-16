package com.xworkz.temple;

public class Temple implements IsckonTemple{
	public Temple() {
		super();
		System.out.println("created Temple with noArgs constructor");
	}

	@Override
	public boolean workship() {
	System.out.println("running workship");
		return false;
	}

	@Override
	public boolean jeansAllowed() {
	System.out.println("running jeansAllowed");	
		return false;
	}

	@Override
	public int poojaTimings() {
		
		return 0;
	}

	@Override
	public boolean wearChudidars() {
		
		return false;
	}

	@Override
	public boolean maintainSilence() {
		
		return false;
	}

	@Override
	public boolean phoneHasToSilenced() {
		
		return false;
	}

	@Override
	public int timings() {
		
		return 0;
	}

	@Override
	public boolean phoneNotAllowed() {
		
		return false;
	}

	@Override
	public boolean showRespect() {
		
		return false;
	}

	@Override
	public boolean showDeity() {
		
		return false;
	}

	@Override
	public boolean followRitualProcedures() {
		
		return false;
	}

}
