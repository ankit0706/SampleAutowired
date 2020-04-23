package com.sample.prop;

public class LegalEntityContact {
	private String email;
	private String officeAddress;
	
	public LegalEntityContact(String e, String o) {
		this.email = e;
		this.officeAddress = o;
	}
	
	@Override
	public String toString() {
		return this.email + "/" + this.officeAddress;
	}
}
