package com.xworkz.Interface;

public class HospitalRunner {

	public static void main(String[] args) {
		FortisHospital fortis=new FortisHospital();
	GovHospitalRule hospital;
	
		fortis.maintainSilence();
		fortis.sanitize();
		fortis.treats();
		fortis.visitorAllowed();
		fortis.serve();
		System.out.println(fortis);
	}
}
	


