package com.xworkz.Interface;

public class FortisHospital implements GovHospitalRule {
	public FortisHospital() {
		super();
		
	}
@Override
public boolean maintainSilence() {
	System.out.println("running maintainSilence in fortisHospital");
	return true;
}
@Override
public int visitorAllowed() {
	System.out.println("running visitorAllowed in fortisHospital");
	return 2;
}
@Override
public boolean serve() {
	System.out.println("running serve in fortisHospital");
	return false;
	
}
@Override
public boolean sanitize() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean treats() {
	// TODO Auto-generated method stub
	return false;
}


	
}
