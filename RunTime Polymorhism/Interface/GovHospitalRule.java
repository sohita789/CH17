package com.xworkz.Interface;

public interface GovHospitalRule extends HospitalRule,DoctorRule{
	
	boolean serve();
	boolean sanitize();
	boolean treats();
	
	

}
