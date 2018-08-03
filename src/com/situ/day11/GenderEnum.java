package com.situ.day11;

public enum GenderEnum {
	// The constructor GenderEnum(String) is undefined
	MALE("男"), FEMALE("女");

	private String value;

	//Illegal modifier for the enum constructor; 
	//only private is permitted.
	private GenderEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
