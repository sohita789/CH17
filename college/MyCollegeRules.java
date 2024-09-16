package com.xworkz.college;


	public class MyCollegeRules implements Engineering{
		
		public MyCollegeRules() {
			super();
			System.out.println("created MyCollegeRules constructor with NoArgs");
		}
		

		@Override
		public boolean exam() {
			System.out.println("running exam in MyCollegeRules");
			return false;
		}

		@Override
		public boolean attendence() {
			System.out.println("running attendence in MyCollegeRules");
	        return false;
		}

		@Override
		public boolean punctual() {
		System.out.println("running punctual in MyCollegeRules");
			return false;
		}

		@Override
		public boolean discipline() {
		System.out.println("running discipline in MyCollegeRules");
			return false;
		}

		@Override
		public boolean sincere() {
			System.out.println("running sincere in MycollegeRules ");
			return false;
		}

		@Override
		public boolean lunchTimings() {
			System.out.println("running lunchTiming in MyCollegeRules");
			return false;
		}

		@Override
		public int noOfClasses() {
			System.out.println("running noOfClasses in MyCollegeRules");
			return 0;
		}

		@Override
		public boolean lastexamDate() {
			System.out.println("running lastEamdate in MyCollegeRules");
			return false;
		}

		@Override
		public int teachingHours() {
		System.out.println("running teachinghours in MyCollegeRules");	
			return 0;
		}

		@Override
		public int prioritizeTimeManagement() {
		System.out.println("running prioritizeTimeManagement in MyCollegeRules");	
			return 0;
		}

		@Override
		public boolean attendClassesRegularly() {
			System.out.println("running attendClassesRegularly in MyCollegeRules");	
			return false;
		}

		@Override
		public boolean takeCareOfHealth() {
			System.out.println("running takeCareOfHealth in MyCollegeRules");
		     return false;
		}

		@Override
		public int manageFinancesWisely() {
			System.out.println("running manageFinanceWisely in MyCollegeRules");
	       return 0;
		}

		@Override
		public boolean respectOthers() {
			System.out.println("running manageFinanceWisely in MyCollegeRules");	
			return false;
		}

		@Override
		public boolean keepBalance() {
	    System.out.println("running keepBalance in MycollegeRules");
			return false;
		}
	}
	    
	    
