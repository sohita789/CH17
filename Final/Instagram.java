package com.workz.Final;

// Final:* It is a keyword ;* The keyword final is used with class,variables and methods;*But it can't be used with the constructor ;
// * when the class is declared as final it can't be be subclassed,It mean no other class can extend or inherit a  final(Parent)class.

public final class Instagram {
	
	private  String accountName;
	private int followers;
	
	public Instagram(String accountName, int followers) {
		super();
		this.accountName = accountName;
		this.followers = followers;
	}
	
	public final void status() {
		
		System.out.println("running the status in Instagram");
		}
	
	

}
