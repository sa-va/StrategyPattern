package com.companyname.strategypattern;

public interface AbilityToFly {
	String fly();
}

class CanFly implements AbilityToFly {
	public String fly() {
		return "I am flying!";
	}
}

class CantFly implements AbilityToFly {
	public String fly() {
		return "I can't fly";
	}
}  
