package com.xworkz.bank;

public interface Bank {
	double withdrawal();
	
	 String openAccount();
	    String closeAccount();
	    String depositMoney(double amount);
	    double withdrawMoney(double amount);
	    boolean checkBalance();
	    boolean transferFunds(double amount, String toAccount);
	    boolean applyForLoan(double amount);
	    double payLoanInstallment(double amount);
	    String updateContactInfo(String newContactInfo);
	    boolean checkLoanStatus();
	    boolean requestAccountStatement();
	    boolean setAccountAlerts(boolean enableAlerts);
	    boolean freezeAccount();
	   boolean unfreezeAccount();
	    String reportFraudulentActivity();
	}



