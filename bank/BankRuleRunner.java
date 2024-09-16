package com.xworkz.bank;

public class BankRuleRunner {

	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		
	 sbi.openAccount();
	 sbi. closeAccount();
	 sbi. depositMoney(1000);
	 sbi.withdrawMoney(2000);
	 sbi. checkBalance();
	 sbi. transferFunds(5000, "sohita");
	 sbi. applyForLoan(60000);
	 sbi.payLoanInstallment(2000);
	 sbi. updateContactInfo("renuka");
	 sbi.checkLoanStatus();
	 sbi.requestAccountStatement();
	 sbi.setAccountAlerts(false);
	 sbi. freezeAccount();
	 sbi. unfreezeAccount();
	 sbi. reportFraudulentActivity();
	 System.out.println(sbi);
	}





	

}
