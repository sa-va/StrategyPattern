package com.companyname.strategypattern;

public class Animal {
	
	private String name;
	private String sound;
	private AbilityToFly flyingType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public AbilityToFly getFlyingType() {
		return flyingType;
	}

	public void setFlyingType(AbilityToFly flyingType) {
		this.flyingType = flyingType;
	}

	public String tryToFly() {
		return flyingType.fly();
	}
	

}
