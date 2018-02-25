package com.companyname.strategypattern;

public class Cat extends Animal {

	public Cat() {
		super();
		this.setSound("Meow!");
		this.setFlyingType(new CantFly());
	}	

}
