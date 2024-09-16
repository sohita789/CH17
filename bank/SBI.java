package com.xworkz.bank;

public class SBI implements StateBankOfIndia{

	@Override
	public double withdrawal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String openAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String closeAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String depositMoney(double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double withdrawMoney(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkBalance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transferFunds(double amount, String toAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applyForLoan(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double payLoanInstallment(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String updateContactInfo(String newContactInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkLoanStatus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean requestAccountStatement() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setAccountAlerts(boolean enableAlerts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean freezeAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unfreezeAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String reportFraudulentActivity() {
		// TODO Auto-generated method stub
		return null;
	}

}
