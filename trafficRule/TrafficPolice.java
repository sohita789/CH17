package com.xworkz.trafficRule;
public class TrafficPolice {
	
	private TrafficRule rule;
	public TrafficPolice() {
		System.out.println("created TrafficPolice with noArg constructor");
	}
	
	public void setTrafficRule(TrafficRule rule) {
		this.rule=rule;
	}
	public void inspection() {
		if(rule!=null) {
			System.out.println("rule is not a null");
			rule.drive();
		}else {
			System.out.println("rule is null");
		}
	}

	
	}


