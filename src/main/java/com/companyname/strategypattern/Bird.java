package com.companyname.strategypattern;

public class Bird extends Animal {

	public Bird() {
		super();
		this.setSound("Tweet tweet!");
		this.setFlyingType(new CanFly());
	}

}