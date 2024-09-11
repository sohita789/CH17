package com.workz.polymorphism.compileTime;

public class GeneralStoreRunner {

	public static void main(String[] args) {
		
		GeneralStore store=new GeneralStore();
		GeneralStore stores=new GeneralStore("Ashirwad Super Market","Rajajinagar");
		store.open();
		stores.open();
		stores.close();
		store.close();
		}
	}
