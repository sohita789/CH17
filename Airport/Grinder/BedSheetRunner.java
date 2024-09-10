package com.workz.Airport.Grinder;

public class BedSheetRunner {

	public static void main(String[] args) {
		
		BedSheet bed=new BedSheet("zudio", "cotton");
		System.out.println(bed.toString());
		
		BedSheet bed1=new BedSheet("max","polyster");
		System.out.println(bed1.toString());
		
		bed.setCost(1500);
		bed.setNoOf(4);

		boolean check=bed.equals(bed1);
		System.out.println("bed1 is same as bed");

	}


	}


